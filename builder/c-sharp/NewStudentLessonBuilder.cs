using System;
using System.Collections.Generic;
using System.Text;

namespace Builder
{
    // LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
    // UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
    class NewStudentLessonBuilder : LessonBuilder
    {
        // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
        // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
        // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
        public override void GetLesson()
        {
            lesson = new Lesson();
            lesson.id = 1;
            lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
            lesson.price = 49.99;
        }

        // Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
        public override void ApplyDiscount()
        {
            lesson.discountedPrice = lesson.price * 0.5;
            lesson.discountApplied = true;
        }

        public override void AddLessonNote()
        {
            lesson.lessonNote = "Hey, welcome. Your discount code has been applied!";
        }

        public override Lesson GetResult()
        {
            return lesson;
        }
    }
}
