import xml.etree.ElementTree as ET
from pyecore.resources import ResourceSet, URI
from pyecore.ecore import EPackage, EClass, EReference


def parse_feature_model(path):
    tree = ET.parse(path)
    root = tree.getroot()
    for child in root.findall('feature'):
        print(child.attrib.get('name'),child.attrib.get('manual'))


def parse_metamodel(path):
    rset = ResourceSet()
    ecore_resource = rset.get_resource(URI(path))
    metamodel = ecore_resource.contents[0]

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
    return

def generate_model(ft,mm):
    rset = ResourceSet()
    new_model_resource = rset.create_resource(URI('path_to_new_model.xmi'))

    # Populate the new model based on the transformation logic
    mapping_ft_to_mm(ft, mm)

    # Save the transformed model
    new_model_resource.save()

    return


if __name__ == '__main__':
    pkgs, classes, refs = parse_metamodel('lowcoders.ecore')
    print(classes)



