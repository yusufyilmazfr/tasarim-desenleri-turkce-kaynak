package main

type Customer struct {
	firstName string
	lastName  string
}

func NewCustomer(firstName string, lastName string) Customer {
	return Customer{
		firstName: firstName,
		lastName:  lastName,
	}
}
