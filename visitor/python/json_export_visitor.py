# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from book_export_visitor import BookExportVisitor
from magazine import Magazine
from encyclopedia import Encyclopedia


class JsonExportVisitor(BookExportVisitor):
    """
    Visitor arayüzünü ve burada tanımlı olan metotları uygular.
    Sonradan eklenmek istenen işlemler burada yer alır.
    UML diyagramındaki ConcreteVisitor yapısına denk gelir.
    """

    def export_visit(self, item):
        # Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
        if isinstance(item, Magazine):
            print(f"{item.name} exported by JsonExportVisitor")
        elif isinstance(item, Encyclopedia):
            print(f"{item.name} exported by JsonExportVisitor")
        else:
            raise NotImplementedError("Item type is not implemented.")
