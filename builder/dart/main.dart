import 'lesson.dart';
import 'lesson_builder.dart';
import 'lesson_director.dart';
import 'new_student_lesson_builder.dart';

void main() {
  final LessonBuilder lessonBuilder = NewStudentLessonBuilder();

  final LessonDirector lessonDirector = LessonDirector(lessonBuilder);
  lessonDirector.make();

  final Lesson lesson = lessonBuilder.getResult();

  print("${lesson.name} - ${lesson.price} - ${lesson.discountedPrice}");
  // output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. - 49.99 - 24.995
}
