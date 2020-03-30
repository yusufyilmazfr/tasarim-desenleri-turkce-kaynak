package Builder;

// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
public class OldStudentLessonBuilder extends LessonBuilder {
    // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
    // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
    // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
    @Override
    public void getLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    // Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
    @Override
    public void applyDiscount() {
        lesson.discountedPrice = lesson.price;
        lesson.discountApplied = false;
    }

    @Override
    public void addLessonNote() {
        lesson.lessonNote = "";
    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}
