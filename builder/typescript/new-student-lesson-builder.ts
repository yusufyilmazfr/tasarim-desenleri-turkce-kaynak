import {LessonBuilder} from "./lesson-builder";
import {Lesson} from "./lesson";

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
export class NewStudentLessonBuilder extends LessonBuilder {
  // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
  // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
  // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
  public getLesson(): void {
    this.lesson = new Lesson();
    this.lesson.id = 1;
    this.lesson.name = 'Artificial Intelligence -  Beginner to Advanced in 10 Minute.';
    this.lesson.price = 49.99;
  }

  // Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
  public applyDiscount(): void {
    this.lesson.discountedPrice = this.lesson.price * 0.5;
    this.lesson.discountApplied = true;
  }

  public addLessonNote(): void {
    this.lesson.lessonNote = 'Hey, welcome. Your discount code has been applied!';
  }

  public getResult(): Lesson {
    return this.lesson;
  }
}
