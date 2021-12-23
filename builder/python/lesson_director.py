from lesson_builder import LessonBuilder


class LessonDirector:
    _lesson_builder: LessonBuilder

    def __init__(self, lesson_builder: LessonBuilder):
        self._lesson_builder = lesson_builder

    def make(self):
        self._lesson_builder.get_lesson()
        self._lesson_builder.apply_discount()
        self._lesson_builder.add_lesson_note()
