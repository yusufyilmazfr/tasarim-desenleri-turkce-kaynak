package main

// İstemcinin muhatap olacağı sınıftır.
// Proxy sınıfımızdır.
// Gerçek işi yapan MaskOrder sınıfının referansını tutar.
// Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
type authenticatableMaskOrderProxy struct {
	orderMask OrderableMask
}

func NewAuthenticatableMaskOrderProxy() *authenticatableMaskOrderProxy {
	return &authenticatableMaskOrderProxy{
		orderMask: NewMaskOrder(),
	}
}

func (o *authenticatableMaskOrderProxy) CreateOrder(p Person) {
	// Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
	if o.checkPersonIsValid(p) {
		o.orderMask.CreateOrder(p)
	}
}

func (o authenticatableMaskOrderProxy) checkPersonIsValid(p Person) bool {
	// Burada Mernis servisleri ile iletişim sağlanabilir.
	// Örnek amaçlı TC numarasının 11 karakter olması yeterlidir.
	// Örnek amaçlı adres alanının boş olmaması yeterlidir.
	return len(p.tc) == 11 && p.address != ""
}
