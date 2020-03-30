package Builder

// UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
abstract class LessonBuilder {
    lateinit var lesson: Lesson

    abstract fun getResult(): Lesson
    abstract fun getLesson()
    abstract fun applyDiscount()
    abstract fun addLessonNote()
}
