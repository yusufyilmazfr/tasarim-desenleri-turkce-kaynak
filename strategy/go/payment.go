package main

// Payment UML diyagramındaki Strategy arayüzüne denk gelmektedir.
// Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
type Payment interface {
	Pay(amount float64)
}
