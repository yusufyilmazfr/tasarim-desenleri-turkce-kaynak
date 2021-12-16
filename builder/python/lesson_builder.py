# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from abc import ABC, abstractmethod
from lesson import Lesson


class LessonBuilder(ABC):
    """
    UML diyagramındaki Product'a denk gelen Lesson sınıfıa ait nesnenin oluşturulması için soyut arayüz sağlar.
    Yapılması gereken adımlar içerisinde tanımlıdır.
    """
    lesson: Lesson

    @abstractmethod
    def get_lesson(self):
        pass

    @abstractmethod
    def apply_discount(self):
        pass

    @abstractmethod
    def add_lesson_note(self):
        pass

    @abstractmethod
    def get_result(self):
        pass
