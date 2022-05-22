package main

//Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
type creditCardManager struct{}

func NewCreditCardManager() *creditCardManager {
	return &creditCardManager{}
}

func (m *creditCardManager) CreateCreditCard(_ Customer) {
	// Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
}
