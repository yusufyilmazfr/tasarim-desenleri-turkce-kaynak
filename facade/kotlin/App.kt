package Facade

fun main(args: Array<String>) {
    val duygu = Customer("Duygu", "Kaya")

    val creditCardFacade = CreditCardFacade()
    creditCardFacade.createCreditCart(duygu)
}
