package Builder

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class OldStudentLessonBuilder : LessonBuilder {

    constructor() {
        lesson = Lesson()
    }

    // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
    // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
    // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
    override fun getLesson() {
        lesson.id = 1
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute."
        lesson.price = 49.99
    }

    // Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
    override fun applyDiscount() {
        lesson.discountedPrice = lesson.price
        lesson.discountApplied = false
    }

    override fun addLessonNote() {
        lesson.lessonNote = ""
    }

    override fun getResult(): Lesson {
        return this.lesson
    }
}
