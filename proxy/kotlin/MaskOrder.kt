package Proxy

// Maske siparişininin oluşturulduğu sınıf.
// İstemcinin direkt erişmesini istemediğimiz alandır.
// UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
internal class MaskOrder : IOrderableMask {

    override fun createOrder(person: Person) {
        // Burada siparişin oluşturulma işlemleri yer alacaktır.
        println("Order created to " + person.address)
    }
}