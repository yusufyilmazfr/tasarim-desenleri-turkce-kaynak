from abc import ABC, abstractmethod


class BookExportVisitor(ABC):
    """
    Her ConcreteVisitor örneği için metot temsil eder.
    Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
    UML diyagramındaki Visitor yapısına denk gelir.
    """

    @abstractmethod
    def export_visit(self, item):
        pass
