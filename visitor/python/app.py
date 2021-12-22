# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from encyclopedia import Encyclopedia
from magazine import Magazine
from xml_export_visitor import XmlExportVisitor
from json_export_visitor import JsonExportVisitor

if __name__ == '__main__':
    earth = Encyclopedia()

    earth.name = "Big Earth!"
    earth.author = "Jose S. Massey"
    earth.category_name = "Encyclopedia"

    daily = Magazine()

    daily.name = "Daily Magazine"
    daily.author = "Wayne D. Eakin"
    daily.category_name = "Magazine"

    xml_export_visitor = XmlExportVisitor()
    json_export_visitor = JsonExportVisitor()

    earth.accept(xml_export_visitor)
    daily.accept(json_export_visitor)

    """
    output:
    Big Earth! exported by XmlExportVisitor
    Daily Magazine exported by JsonExportVisitor
    """
