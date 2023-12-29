import xml.etree.ElementTree as ET
from pyecore.resources import ResourceSet, URI
from pyecore.ecore import EPackage, EClass, EReference, EAttribute

def parse_feature_model(path):
    tree = ET.parse(path)
    root = tree.getroot()
    list_selected = []
    for child in root.findall('feature'):
        if child.attrib.get('manual') or child.attrib.get('automatic'):
            #print(child.attrib.get('name'))
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


def mapping_ft_to_mm(root_ft, root_mm):
    list_feature = parse_feature_model(root_ft)
    pkgs, classes, refs = parse_metamodel(root_mm)
    mapped_classes = []
    for c in classes:
        if c.name in list_feature:
            print('mapped', c)
            mapped_classes.append(c)

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


def instantiate_tourism_rs_model(mm_path):
    # Load the metamodel
    rset = ResourceSet()
    mm_resource = rset.get_resource(URI(mm_path))
    metamodel = mm_resource.contents[0]

    if not isinstance(metamodel, EPackage):
        raise ValueError("The metamodel at the specified path is not an EPackage")

    # Register the metamodel
    rset.metamodel_registry[metamodel.nsURI] = metamodel

    # Create a new model resource
    model_resource = rset.create_resource(URI('TRS_project/tourism_rs_model.xmi'))

    # Instantiate the root element (TourismRS)
    tourism_rs_class = metamodel.getEClassifier('TourismRS')
    if tourism_rs_class is None:
        raise ValueError("TourismRS class not found in the metamodel")

    tourism_rs_instance = tourism_rs_class()

    # Instantiate the algorithm metaclass (CollaborativeFiltering)
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


if __name__ == '__main__':
    #parse_feature_model('trsFM/configs/configTRS.xml')
    instantiate_tourism_rs_model('TRS_project/recommendersystem.ecore')
    #generate_model('trsFM/configs/configTRS.xml', 'TRS_project/recommendersystem.ecore' )
    #attributes = parse_attributes('TRS_project/recommendersystem.ecore')
    #print(attributes)



