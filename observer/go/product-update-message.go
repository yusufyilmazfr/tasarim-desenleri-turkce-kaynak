package main

import "fmt"

// ProductUpdateMessage Bildirilecek olan nesnelere paremetre olarak giden mesaj.
// UML diyagramı ile ilgisi yoktur.
type ProductUpdateMessage struct {
	ProductName string
	Message     string
}

func NewProductUpdateMessage() ProductUpdateMessage {
	return ProductUpdateMessage{}
}

func (m ProductUpdateMessage) ToString() string {
	return fmt.Sprintf("%s updated. Message: %s.", m.ProductName, m.Message)
}
