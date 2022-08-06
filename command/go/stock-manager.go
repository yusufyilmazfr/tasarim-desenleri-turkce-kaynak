package main

import "fmt"

// StockManager komutları nesneler haline getirelecek olan sınıf.
// UML diyagramındaki Receiver sınıfına denk gelmektedir.
type StockManager struct {
	name     string
	quantity int
}

func NewStockManager(name string, quantity int) *StockManager {
	return &StockManager{
		name:     name,
		quantity: quantity,
	}
}

func (m *StockManager) Buy() {
	m.quantity++
	fmt.Printf("Stock: %s, %d bought!\n", m.name, m.quantity)
}

func (m *StockManager) Sell() {
	m.quantity--
	fmt.Printf("Stock: %s, %d sold!\n", m.name, m.quantity)
}
