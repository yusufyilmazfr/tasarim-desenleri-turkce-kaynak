package main

func main() {
	shopCart := NewShoppingCart()
	shopCart.AddItem(NewItem("894651364", 80))
	shopCart.AddItem(NewItem("654798243", 20))

	shopCart.SetPaymentMethod(NewPayPalPayment("serhatkarabulut@gmail.com", "123456789"))
	shopCart.Pay()

	shopCart.SetPaymentMethod(NewCreditCardPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"))
	shopCart.Pay()
}
