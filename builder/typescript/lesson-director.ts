import {LessonBuilder} from "./lesson-builder";

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
export class LessonDirector {
  constructor(private readonly lessonBuilder: LessonBuilder) {}

  public make(): void {
    this.lessonBuilder.getLesson();
    this.lessonBuilder.applyDiscount();
    this.lessonBuilder.addLessonNote();
  }
}
