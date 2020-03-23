package Strategy

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
internal class PaypalPayment(private val email: String, private val password: String) : IPayment {

    override fun pay(amount: Int) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        println("Paid by Paypal.")
    }
}