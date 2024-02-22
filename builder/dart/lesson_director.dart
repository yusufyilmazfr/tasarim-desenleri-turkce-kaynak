import 'lesson_builder.dart';

final class LessonDirector {
  late final LessonBuilder _builder;

  LessonDirector(LessonBuilder builder) {
    _builder = builder;
  }

  void make() {
    _builder.getLesson();
    _builder.applyDiscount();
    _builder.addLessonNote();
  }
}
