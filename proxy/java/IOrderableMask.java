package Proxy;

// Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
// UML diyagramındaki Service arayüzüne denk gelmektedir.
interface IOrderableMask {
    void createOrder(Person person);
}