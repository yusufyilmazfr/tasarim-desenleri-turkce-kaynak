import {NewStudentLessonBuilder} from "./new-student-lesson-builder";
import {LessonDirector} from "./lesson-director";

function main() {
  const lessonBuilder = new NewStudentLessonBuilder();

  const lessonDirector = new LessonDirector(lessonBuilder);
  lessonDirector.make();

  const lesson = lessonBuilder.getResult();

  console.log(`${lesson.name} - ${lesson.price} - ${lesson.discountedPrice}`);
  // output: Artificial Intelligence - Beginner to Advanced in 10 Minute. - 49,99 - 24,995
}
