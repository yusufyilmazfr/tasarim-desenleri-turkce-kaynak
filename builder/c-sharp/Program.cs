using System;

namespace Builder
{
    class Program
    {
        static void Main(string[] args)
        {
            LessonBuilder lessonBuilder = new NewStudentLessonBuilder();

            LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
            lessonDirector.Make();

            Lesson lesson = lessonBuilder.GetResult();

            Console.WriteLine($"{lesson.name} - {lesson.price} - {lesson.discountedPrice}");
            // output: Artificial Intelligence - Beginner to Advanced in 10 Minute. - 49,99 - 24,995
        }
    }
}
