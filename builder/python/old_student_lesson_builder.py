# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from lesson_builder import LessonBuilder
from lesson import Lesson


class OldStudentLessonBuilder(LessonBuilder):
    """
    LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
    UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
    """

    def __init__(self):
        self.lesson = Lesson()

    def get_lesson(self):
        """
        Burada nesne çağırma işlemleri gerçekleştirilmektedir.
        Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
        Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
        """
        self.lesson.id = 1
        self.lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute."
        self.lesson.price = 49.99

    def apply_discount(self):
        self.lesson.discounted_price = self.lesson.price
        self.lesson.discount_applied = False

    def add_lesson_note(self):
        self.lesson.lesson_note = ""

    def get_result(self):
        return self.lesson
