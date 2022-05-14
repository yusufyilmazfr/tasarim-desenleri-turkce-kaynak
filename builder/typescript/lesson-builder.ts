import {Lesson} from "./lesson";

// UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
export abstract class LessonBuilder {
  public lesson: Lesson;

  public abstract getLesson(): void;
  public abstract applyDiscount(): void;
  public abstract addLessonNote(): void;
  public abstract getResult(): Lesson;
}
