package main

// ObservableProduct Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
// UML diyagramındaki Observable yapısına denk gelmektedir.
type ObservableProduct struct {
	users   []ObserverUser
	message ProductUpdateMessage
}

func NewObservableProduct() *ObservableProduct {
	return &ObservableProduct{
		users:   make([]ObserverUser, 0),
		message: NewProductUpdateMessage(),
	}
}

func (p *ObservableProduct) AddObserver(ou ObserverUser) {
	p.users = append(p.users, ou)
}

func (p *ObservableProduct) RemoveObserver(ou ObserverUser) {
	// Implement It
}

func (p ObservableProduct) NotifyObserver() {
	for _, u := range p.users {
		u.SendNotification(p.message)
	}
}
