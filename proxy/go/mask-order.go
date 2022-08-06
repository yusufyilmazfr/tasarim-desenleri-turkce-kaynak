package main

import "fmt"

// Maske siparişininin oluşturulduğu sınıf.
// İstemcinin direkt erişmesini istemediğimiz alandır.
// UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
type maskOrder struct{}

func NewMaskOrder() *maskOrder {
	return &maskOrder{}
}

func (o maskOrder) CreateOrder(p Person) {
	// Burada siparişin oluşturulma işlemleri yer alacaktır.
	fmt.Println("Order created to " + p.address)
}
