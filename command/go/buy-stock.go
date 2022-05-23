package main

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
type buyStock struct {
	sm *StockManager
}

func NewBuyStock(sm *StockManager) *buyStock {
	return &buyStock{
		sm: sm,
	}
}

func (s buyStock) Execute() {
	s.sm.Buy()
}
