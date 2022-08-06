package main

// Person maske siparişini verecek kullanıcıları temsili sınıf.
type Person struct {
	tc      string
	address string
}

func NewPerson(tc, address string) Person {
	return Person{
		tc:      tc,
		address: address,
	}
}
