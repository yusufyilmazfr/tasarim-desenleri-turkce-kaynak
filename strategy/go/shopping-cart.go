package main

// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
type shoppingCart struct {
	items   []*Item
	payment Payment
}

func NewShoppingCart() *shoppingCart {
	return &shoppingCart{
		items: make([]*Item, 0),
	}
}

func (s *shoppingCart) AddItem(item *Item) {
	s.items = append(s.items, item)
}

func (s *shoppingCart) SetPaymentMethod(p Payment) {
	s.payment = p
}

func (s shoppingCart) GetTotal() float64 {
	total := 0.0
	for _, item := range s.items {
		total += item.GetPrice()
	}
	return total
}

func (s shoppingCart) Pay() {
	s.payment.Pay(s.GetTotal())
}
