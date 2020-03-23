package Strategy

fun main(args: Array<String>) {
    val shoppingCart = ShoppingCart()
    shoppingCart.addItem(Item("894651364", 80))
    shoppingCart.addItem(Item("654798243", 20))

    shoppingCart.setPaymentMethod(PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"))
    shoppingCart.Pay()

    shoppingCart.setPaymentMethod(CreditCartPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"))
    shoppingCart.Pay()
}
