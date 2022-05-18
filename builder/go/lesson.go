package main

// UML diyagramındaki Product sınıfına denk gelmektedir.
// Farklı sunumları olan sınıfımız budur.
type lesson struct {
	id              int
	name            string
	price           float32
	discountedPrice float32
	discountApplied bool
	lessonNote      string
}

func newLesson() *lesson {
	return &lesson{}
}
