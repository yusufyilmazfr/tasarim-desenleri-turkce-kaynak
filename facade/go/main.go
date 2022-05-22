package main

func main() {
	duygu := NewCustomer("Duygu", "Kaya")

	creditCard := NewCreditCardFacade()
	creditCard.CreateCreditCard(duygu)
}
