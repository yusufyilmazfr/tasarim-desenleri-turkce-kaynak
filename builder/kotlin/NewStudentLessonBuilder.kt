package Builder

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class NewStudentLessonBuilder : LessonBuilder {

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

    // Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
    override fun applyDiscount() {
        lesson.discountedPrice = lesson.price * 0.5
        lesson.discountApplied = true
    }

    override fun addLessonNote() {
        lesson.lessonNote = "Hey, welcome. Your discount code has been applied!"
    }

    override fun getResult(): Lesson {
        return this.lesson
    }
}
