import 'lesson.dart';
import 'lesson_builder.dart';

final class OldStudentLessonBuilder implements LessonBuilder {
  @override
  late Lesson lesson;

  @override
  void getLesson() {
    lesson = Lesson();
    lesson.id = 1;
    lesson.name = 'Artificial Intelligence -  Beginner to Advanced in 10 Minute.';
    lesson.price = 49.99;
  }

  @override
  void applyDiscount() {
    lesson.discountedPrice = lesson.price;
    lesson.discountApplied = false;
  }

  @override
  void addLessonNote() {
    lesson.lessonNote = '';
  }

  @override
  Lesson getResult() {
    return lesson;
  }
}
