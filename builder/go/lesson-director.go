package main

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
type lessonDirector struct {
	lessonBuilder LessonBuilder
}

func NewLessonDirector(lessonBuilder LessonBuilder) *lessonDirector {
	return &lessonDirector{lessonBuilder: lessonBuilder}
}

func (l *lessonDirector) make() {
	l.lessonBuilder.getLesson()
	l.lessonBuilder.applyDiscount()
	l.lessonBuilder.addLessonNote()
}
