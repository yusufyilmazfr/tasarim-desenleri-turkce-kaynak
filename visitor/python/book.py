from abc import ABC, abstractmethod


class Book(ABC):
    """
    Temel sınıftır.
    Yeni davranışları Accept metotu ile alır.
    UML diyagramındaki Element yapısına denk gelmektedir.
    """
    name: str
    author: str
    category_name: str

    @abstractmethod
    def accept(self, visitor):
        pass
