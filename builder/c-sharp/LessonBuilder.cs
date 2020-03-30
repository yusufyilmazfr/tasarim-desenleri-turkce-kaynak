using System;
using System.Collections.Generic;
using System.Text;

namespace Builder
{
    // UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
    // Yapılması gereken adımlar içerisinde tanımlıdır.
    abstract class LessonBuilder
    {
        public Lesson lesson;

        public abstract void GetLesson();
        public abstract void ApplyDiscount();
        public abstract void AddLessonNote();
        public abstract Lesson GetResult();
    }
}
