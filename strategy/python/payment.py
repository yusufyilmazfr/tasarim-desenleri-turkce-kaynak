from abc import ABC, abstractmethod


class Payment(ABC):
    """
    UML diyagramındaki Strategy arayüzüne denk gelmektedir.
    Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
    """

    @abstractmethod
    def pay(self, amount: int):
        pass
