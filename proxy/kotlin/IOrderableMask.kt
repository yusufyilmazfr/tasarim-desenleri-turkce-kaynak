package Proxy

// Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
// UML diyagramındaki Service arayüzüne denk gelmektedir.
internal interface IOrderableMask {
    fun createOrder(person: Person)
}