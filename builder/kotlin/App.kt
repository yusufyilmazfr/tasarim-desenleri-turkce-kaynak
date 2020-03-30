package Builder

fun main(args: Array<String>) {
    val lessonBuilder = NewStudentLessonBuilder()

    val lessonDirector = LessonDirector(lessonBuilder)
    lessonDirector.make()

    val lesson = lessonBuilder.getResult()

    val result = String.format("%s %f %f", lesson.name, lesson.price, lesson.discountedPrice)
    println(result)
    // output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. 49,990000 24,995000
}
