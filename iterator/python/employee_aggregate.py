from abc import ABC, abstractmethod


class EmployeeAggregate(ABC):
    """
    Iterator arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir.
    Bu sayede çeşitli Iterator arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.
    UML diyagramındaki Aggregate arayüzüne denk gelmektedir.
    """

    @abstractmethod
    def create_iterator(self):
        pass
