using System;
using System.Collections.Generic;
using System.Text;

namespace Builder
{
    // Builder arayüzünü kullanarak nesne örneklemesi yapar.
    // UML diyagramındaki Director'a denk gelmektedir.
    class LessonDirector
    {
        private LessonBuilder lessonBuilder;

        public LessonDirector(LessonBuilder lessonBuilder)
        {
            this.lessonBuilder = lessonBuilder;
        }

        public void Make()
        {
            lessonBuilder.GetLesson();
            lessonBuilder.ApplyDiscount();
            lessonBuilder.AddLessonNote();
        }
    }

}
