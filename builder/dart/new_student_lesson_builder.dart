import 'lesson.dart';
import 'lesson_builder.dart';

final class NewStudentLessonBuilder implements LessonBuilder {
  @override
  late Lesson lesson;

  @override
  void getLesson() {
    lesson = Lesson();
    lesson.id = 1;
    lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
    lesson.price = 49.99;
  }

  @override
  void applyDiscount() {
    lesson.discountedPrice = lesson.price! * 0.5;
    lesson.discountApplied = true;
  }

  @override
  void addLessonNote() {
    lesson.lessonNote = "Hey, welcome. Your discount code has been applied!";
  }

  @override
  Lesson getResult() {
    return lesson;
  }
}
