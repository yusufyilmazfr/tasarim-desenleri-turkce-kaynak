package Proxy;

// Maske siparişininin oluşturulduğu sınıf.
// İstemcinin direkt erişmesini istemediğimiz alandır.
// UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
class MaskOrder implements IOrderableMask {

    public void createOrder(Person person) {
        // Burada siparişin oluşturulma işlemleri yer alacaktır.
        System.out.println("Order created to " + person.address);
    }
}