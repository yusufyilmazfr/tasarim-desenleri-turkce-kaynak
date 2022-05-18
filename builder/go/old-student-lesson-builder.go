package main

// oldStudentLessonBuilder LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
type oldStudentLessonBuilder struct {
	Lesson *lesson
}

func NewOldStudentLessonBuilder() *oldStudentLessonBuilder {
	return &oldStudentLessonBuilder{}
}

func (n *oldStudentLessonBuilder) getLesson() {
	n.Lesson = newLesson()
	n.Lesson.id = 1
	n.Lesson.name = "Artificial Intelligence - Beginner to Advanced in 10 Minute."
	n.Lesson.price = 49.99
}

// Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
func (n *oldStudentLessonBuilder) applyDiscount() {
	n.Lesson.discountedPrice = n.Lesson.price
	n.Lesson.discountApplied = false
}

func (n *oldStudentLessonBuilder) addLessonNote() {
	n.Lesson.lessonNote = "Hey, welcome. Your discount code has been applied!"
}

func (n *oldStudentLessonBuilder) getResult() *lesson {
	return n.Lesson
}
