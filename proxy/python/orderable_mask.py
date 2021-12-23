from abc import ABC, abstractmethod
from person import Person


class OrderableMask(ABC):
    """
    Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
    UML diyagramındaki Service arayüzüne denk gelmektedir.
    """

    @abstractmethod
    def create_order(self, person: Person):
        pass
