package main

// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
type lessonDirector struct {
	lessonBuilder lessonBuilder
}

func NewLessonDirector(lessonBuilder lessonBuilder) *lessonDirector {
	return &lessonDirector{lessonBuilder: lessonBuilder}
}

func (l *lessonDirector) make() {
	l.lessonBuilder.getLesson()
	l.lessonBuilder.applyDiscount()
	l.lessonBuilder.addLessonNote()
}
