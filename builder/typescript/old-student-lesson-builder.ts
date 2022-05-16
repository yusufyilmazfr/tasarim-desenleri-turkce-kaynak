import {LessonBuilder} from "./lesson-builder";
import {Lesson} from "./lesson";

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
export class OldStudentLessonBuilder extends LessonBuilder{
  // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
  // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
  // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
  getLesson(): void {
    this.lesson = new Lesson();
    this.lesson.id = 1;
    this.lesson.name = 'Artificial Intelligence -  Beginner to Advanced in 10 Minute.';
    this.lesson.price = 49.99;
  }

  // Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
  applyDiscount(): void {
    this.lesson.discountedPrice = this.lesson.price;
    this.lesson.discountApplied = false;
  }

  addLessonNote(): void {
    this.lesson.lessonNote = '';
  }

  getResult(): Lesson {
    return this.lesson;
  }
}
