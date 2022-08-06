package main

// newStudentLessonBuilder LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
type newStudentLessonBuilder struct {
	Lesson *lesson
}

func NewNewStudentLessonBuilder() *newStudentLessonBuilder {
	return &newStudentLessonBuilder{}
}

func (n *newStudentLessonBuilder) getLesson() {
	n.Lesson = newLesson()
	n.Lesson.id = 1
	n.Lesson.name = "Artificial Intelligence - Beginner to Advanced in 10 Minute."
	n.Lesson.price = 49.99
}

// Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
func (n *newStudentLessonBuilder) applyDiscount() {
	n.Lesson.discountedPrice = n.Lesson.price * 0.5
	n.Lesson.discountApplied = true
}

func (n *newStudentLessonBuilder) addLessonNote() {
	n.Lesson.lessonNote = "Hey, welcome. Your discount code has been applied!"
}

func (n *newStudentLessonBuilder) getResult() *lesson {
	return n.Lesson
}
