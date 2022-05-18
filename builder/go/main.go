package main

import "fmt"

func main() {
	LessonBuilder := NewNewStudentLessonBuilder()
	LessonDirector := NewLessonDirector(LessonBuilder)
	LessonDirector.make()

	Lesson := LessonBuilder.getResult()

	fmt.Printf("%s %f %f", Lesson.name, Lesson.price, Lesson.discountedPrice)
	// output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. 49,990000 24,995000
}
