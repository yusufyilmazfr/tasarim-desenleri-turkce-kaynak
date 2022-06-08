package main

// Item Sepette bulunan ürünleri temsil eden sınıf.
// Ürün kodu ve fiyat bilgileri temel olarak yeterlidir.
type Item struct {
	upcCode string
	price   float64
}

func NewItem(upcCode string, price float64) *Item {
	return &Item{
		upcCode: upcCode,
		price:   price,
	}
}

func (i Item) GetPrice() float64 {
	return i.price
}
