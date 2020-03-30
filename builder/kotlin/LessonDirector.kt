package Builder

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
class LessonDirector(private val lessonBuilder: LessonBuilder) {

    fun make() {
        lessonBuilder.getLesson()
        lessonBuilder.applyDiscount()
        lessonBuilder.addLessonNote()
    }
}
