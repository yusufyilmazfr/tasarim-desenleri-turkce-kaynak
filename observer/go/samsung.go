package main

// Observer sınıfından türer.
// UML diyagramındaki ConcreteObservable yapısına denk gelmektedir.
type samsung struct {
	ObservableProduct *ObservableProduct
}

func NewSamsung() *samsung {
	return &samsung{
		ObservableProduct: NewObservableProduct(),
	}
}

// ChangePrice Ürün fiyatı değiştikten sonra Observer örneklerine bildirim gönderilir.
func (s *samsung) ChangePrice() {
	// Ürün fiyatlarının güncellenmesi vs.
	s.ObservableProduct.message.ProductName = "Samsung"
	s.ObservableProduct.message.Message = "Samsung's price updated."
	s.ObservableProduct.NotifyObserver()
}
