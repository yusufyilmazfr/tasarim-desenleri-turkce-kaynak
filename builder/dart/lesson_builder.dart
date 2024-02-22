import 'lesson.dart';

abstract class LessonBuilder {
  Lesson get lesson;
  void getLesson();
  void applyDiscount();
  void addLessonNote();
  Lesson getResult();
}
