package main

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
type sellStock struct {
	sm *StockManager
}

func NewSellStock(sm *StockManager) *sellStock {
	return &sellStock{
		sm: sm,
	}
}

func (s sellStock) Execute() {
	s.sm.Sell()
}
