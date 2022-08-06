package main

// OrderableMask sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
// UML diyagramındaki Service arayüzüne denk gelmektedir.
type OrderableMask interface {
	CreateOrder(p Person)
}
