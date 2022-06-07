package main

import "fmt"

// Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
// Değişim update metotu ile bildirilir.
// UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
type observerUser struct{}

func NewObserverUser() *observerUser {
	return &observerUser{}
}

func (u observerUser) SendNotification(msg ProductUpdateMessage) {
	fmt.Println(msg.ToString())
}
