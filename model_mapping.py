import xml.etree.ElementTree as ET
from pyecore.resources import ResourceSet, URI
from pyecore.ecore import EPackage, EClass, EReference, EAttribute, EObject
from jinja2 import Environment, FileSystemLoader

def parse_feature_model(path):
    tree = ET.parse(path)
    root = tree.getroot()
    list_selected = []
    for child in root.findall('feature'):
        if child.attrib.get('manual'):
            list_selected.append(child.attrib.get('name'))

    return list_selected

def parse_attributes(path):
    rset = ResourceSet()
    ecore_resource = rset.get_resource(URI(path))
    metamodel = ecore_resource.contents[0]

    class_attributes = {}

    def process_e_class(eclass):
        if isinstance(eclass, EClass):
            attributes = [attribute for attribute in eclass.eStructuralFeatures if isinstance(attribute, EAttribute)]
            class_attributes[eclass.name] = attributes

    def process_e_package(package):
        for eclass in package.eClassifiers:
            process_e_class(eclass)
        for subpack in package.eSubpackages:
            process_e_package(subpack)

    # Assuming the root of the metamodel is an EPackage
    if isinstance(metamodel, EPackage):
        process_e_package(metamodel)

    return class_attributes




def parse_metamodel(path):
    rset = ResourceSet()
    ecore_resource = rset.get_resource(URI(path))
    metamodel = ecore_resource.contents[0]
    rset.metamodel_registry[metamodel.nsURI] = metamodel
    e_packages = []
    e_classes = []
    e_references = []

    def process_e_package(package):
        e_packages.append(package)
        for eclass in package.eClassifiers:
            if isinstance(eclass, EClass):
                e_classes.append(eclass)
                for eref in eclass.eStructuralFeatures:
                    if isinstance(eref, EReference):
                        e_references.append(eref)

    # Assuming the root of the metamodel is an EPackage
    if isinstance(metamodel, EPackage):
        process_e_package(metamodel)
        # If the metamodel contains subpackages, process them as well
        for subpack in metamodel.eSubpackages:
            process_e_package(subpack)

    return e_packages, e_classes, e_references


def mapping_ft_to_mm(root_ft,classes):
    list_feature = parse_feature_model(root_ft)

    mapped_classes = []
    for c in classes:
        if c.name in list_feature:
            print('mapped', c)
            mapped_classes.append(c.name)

    return mapped_classes

def generate_model(ft, mm_path):
    rset = ResourceSet()

    # Load the metamodel
    mm_resource = rset.get_resource(URI(mm_path))
    metamodel = mm_resource.contents[0]
    if isinstance(metamodel, EPackage):
        rset.metamodel_registry[metamodel.nsURI] = metamodel
    else:
        raise ValueError("The metamodel at the specified path is not an EPackage")

    # Create a new model resource
    model_gen = rset.create_resource(URI('out_model.xmi'))

    # Populate the new model based on the transformation logic

    e_packages = []
    e_classes = []
    e_references = []

    def process_e_package(package):
        e_packages.append(package)
        for eclass in package.eClassifiers:
            if isinstance(eclass, EClass):
                e_classes.append(eclass)
                for eref in eclass.eStructuralFeatures:
                    if isinstance(eref, EReference):
                        e_references.append(eref)

    # Assuming the root of the metamodel is an EPackage
    if isinstance(metamodel, EPackage):
        process_e_package(metamodel)
        # If the metamodel contains subpackages, process them as well
        for subpack in metamodel.eSubpackages:
            process_e_package(subpack)
    #mapped_classes = mapping_ft_to_mm(ft, metamodel)
    for eclass in e_classes:
        # Create an instance of each EClass
        instance = eclass()
        # Add the instance to the resource
        model_gen.append(instance)

    # Save the transformed model
    model_gen.save()

    return model_gen


def instantiate_tourism_rs_model(root_ft, mm_path):
    # Load the metamodel
    rset = ResourceSet()
    mm_resource = rset.get_resource(URI(mm_path))
    metamodel = mm_resource.contents[0]

    if not isinstance(metamodel, EPackage):
        raise ValueError("The metamodel at the specified path is not an EPackage")

    # Register the metamodel
    rset.metamodel_registry[metamodel.nsURI] = metamodel

    e_packages = []
    e_classes = []
    e_references = []

    def process_e_package(package):
        e_packages.append(package)
        for eclass in package.eClassifiers:
            if isinstance(eclass, EClass):
                e_classes.append(eclass)
                for eref in eclass.eStructuralFeatures:
                    if isinstance(eref, EReference):
                        e_references.append(eref)

    # Assuming the root of the metamodel is an EPackage
    if isinstance(metamodel, EPackage):
        process_e_package(metamodel)
        # If the metamodel contains subpackages, process them as well
        for subpack in metamodel.eSubpackages:
            process_e_package(subpack)

    # Create a new model resource
    model_resource = rset.create_resource(URI('TRS_project/tourism_rs_model.xmi'))



    # Instantiate the root element (TourismRS)
    tourism_rs_class = metamodel.getEClassifier('TourismRS')
    if tourism_rs_class is None:
        raise ValueError("TourismRS class not found in the metamodel")

    tourism_rs_instance = tourism_rs_class()

    mapped_classes = mapping_ft_to_mm(root_ft, e_classes)
    print(mapped_classes)

    # Instantiate the algorithm metaclass (CollaborativeFiltering)
    if 'CollaborativeFiltering' in mapped_classes:
        algorithm_class = metamodel.getEClassifier('CollaborativeFiltering')
        if algorithm_class is None:
            raise ValueError("Algorithm class not found in the metamodel")

        algorithm_instance = algorithm_class()
        tourism_rs_instance.algorithm = algorithm_instance

    # Add the root instance to the resource
    model_resource.append(tourism_rs_instance)

    # Save the model
    model_resource.save()

    return model_resource


def append_to_xml_tag(xml_string, append_str):
    # Find the position of the last element before '>'
    last_element_pos = xml_string.rfind('>')

    # If '>' is not found or at the end of the string, return the original string
    if last_element_pos == -1 or last_element_pos == len(xml_string) - 1:
        return xml_string

    # Insert the append_str before the last '>'
    return xml_string[:last_element_pos] + append_str + xml_string[last_element_pos:]



def add_schema_location_to_xmi(xmi_file_path, schema_location, out_file):
    with open(out_file, 'w', encoding='utf-8') as res:
        with open(xmi_file_path, 'r', encoding='utf-8') as model_file:
            lines = model_file.readlines()
            for l in lines:
                if 'xmlns:xmi="http://www.omg.org/XMI' in l:
                    res.write(append_to_xml_tag(l,schema_location))
                else:
                    res.write(l)

def gather_classes(element, class_info):
    if isinstance(element, EObject):
        eclass = element.eClass
        class_name = eclass.name
        if class_name not in class_info:
            # Get attribute names for the class
            attributes = [attr.name for attr in eclass.eAttributes if isinstance(attr, EAttribute)]
            class_info[class_name] = attributes
        for child in element.eContents:
            gather_classes(child, class_info)

def open_xmi_and_initialize_template(xmi_path, template_path, template_name, metamodel_path):
    # Load and register the metamodel


    rset = ResourceSet()
    mm_resource = rset.get_resource(URI(metamodel_path))
    metamodel = mm_resource.contents[0]
    if isinstance(metamodel, EPackage):
        rset.metamodel_registry[metamodel.nsURI] = metamodel
    else:
        raise ValueError("The metamodel at the specified path is not an EPackage")

    # Load the XMI model using the registered metamodel
    resource = rset.get_resource(URI(xmi_path))
    root = resource.contents[0]

    # Extract data from the XMI model
    # Customize this part according to the structure of your XMI model

    class_info = {}
    gather_classes(root, class_info)


    model_data = {
        'class_info': class_info,
        # Add more data extraction as needed
    }

    # Initialize Jinja2 environment and load the template
    env = Environment(loader=FileSystemLoader(template_path))
    template = env.get_template(template_name)

    # Render the template with the model data
    rendered_output = template.render(model_data)

    return rendered_output


    #tree.write(xmi_file_path, encoding='utf-8', xml_declaration=True)

if __name__ == '__main__':
    #parse_feature_model('trsFM/configs/configTRS.xml')
    #instantiate_tourism_rs_model('trsFM/configs/configTRS.xml','TRS_project/recommendersystem.ecore')
    #add_schema_location_to_xmi('TRS_project/tourism_rs_model.xmi', ' xsi:schemaLocation="https://org.rs recommendersystem.ecore"', 'TRS_project/model.xmi')
    #generate_model('trsFM/configs/configTRS.xml', 'TRS_project/recommendersystem.ecore' )
    #attributes = parse_attributes('TRS_project/recommendersystem.ecore')
    xmi_path = 'TRS_project/tourism_rs_model.xmi'
    template_path = 'template'
    template_name = 'recommendation_template.jinja'
    metamodel_path = 'TRS_project/recommendersystem.ecore'
    rendered_code = open_xmi_and_initialize_template(xmi_path, template_path, template_name, metamodel_path)
    print(rendered_code)
    #print(attributes)



