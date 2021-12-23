from abc import ABC, abstractmethod
from box_color import BoxColor


class Box(ABC):
    """
    Nesnenin ortak özelliklerini tutan sınıftır.
    UML diyagramındaki Flyweight yapısına denk gelmektedir.
    """
    width: int
    height: int
    box_color: BoxColor

    @abstractmethod
    def draw(self, location_x, location_y):
        pass
