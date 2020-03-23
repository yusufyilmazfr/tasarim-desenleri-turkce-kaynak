package Strategy

// UML diyagramındaki Strategy arayüzüne denk gelmektedir.
// Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
internal interface IPayment {
    fun pay(amount: Int)
}
