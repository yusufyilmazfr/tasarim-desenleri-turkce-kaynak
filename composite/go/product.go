package main

import "fmt"

// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
type product struct {
	name string
}

func NewProduct(name string) *product {
	return &product{name: name}
}

func (p *product) DrawHierarchy() {
	fmt.Println(p.name)
}
