package main

import "fmt"

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
type paypalPayment struct {
	email    string
	password string
}

func NewPayPalPayment(email, password string) Payment {
	return paypalPayment{
		email:    email,
		password: password,
	}
}

func (p paypalPayment) Pay(amount float64) {
	// Paypal ödeme işlemlerinin gerçekleştiği yer.
	fmt.Printf("Paypal payment: %.2f\n", amount)
}
