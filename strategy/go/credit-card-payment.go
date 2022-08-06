package main

import "fmt"

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
type creditCardPayment struct {
	cardNumber string
	expiryDate string
	cvv        string
	name       string
}

func NewCreditCardPayment(cardNumber, expiryDate, cvv, name string) Payment {
	return creditCardPayment{
		cardNumber: cardNumber,
		expiryDate: expiryDate,
		cvv:        cvv,
		name:       name,
	}
}

func (c creditCardPayment) Pay(amount float64) {
	// Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
	fmt.Printf("Credit card payment: %.2f\n", amount)
}
