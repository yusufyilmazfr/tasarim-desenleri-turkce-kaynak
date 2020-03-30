package Builder;

// UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
abstract class LessonBuilder
{
    public Lesson lesson;

    public abstract void getLesson();
    public abstract void applyDiscount();
    public abstract void addLessonNote();
    public abstract Lesson getResult();
}
