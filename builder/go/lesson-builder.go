package main

// UML diyagramındaki Product'a denk gelen Lesson sınıfına ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
type lessonBuilder interface {
	getLesson()
	applyDiscount()
	addLessonNote()
	getResult() *lesson
}
