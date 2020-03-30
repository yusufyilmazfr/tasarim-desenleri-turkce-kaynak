package Builder;

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
public class LessonDirector {
    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder) {
        this.lessonBuilder = lessonBuilder;
    }

    public void make() {
        lessonBuilder.getLesson();
        lessonBuilder.applyDiscount();
        lessonBuilder.addLessonNote();
    }
}
