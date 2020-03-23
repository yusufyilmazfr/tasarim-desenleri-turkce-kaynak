package Strategy

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
internal class CreditCartPayment(
    private val name: String,
    private val cardNumber: String,
    private val cvv: String,
    private val dateOfExpiry: String
) : IPayment {

    override fun pay(amount: Int) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        println("Paid by credit cart.")
    }
}