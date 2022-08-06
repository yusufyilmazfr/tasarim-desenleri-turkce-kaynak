package main

// Banka müşterimizi temsili oluşturan sınıf.
type creditCardFacade struct {
}

func NewCreditCardFacade() *creditCardFacade {
	return &creditCardFacade{}
}

func (f *creditCardFacade) CreateCreditCard(c Customer) {
	creditCardManager := NewCreditCardManager()

	blackListService := NewBlackListService()
	if !blackListService.CheckEmployeeIsTheBlackList(c) {
		creditCardManager.CreateCreditCard(c)
	}
}
