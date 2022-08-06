package main

import "fmt"

// deliveryState Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
type deliveryState struct{}

// deliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
// Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (waitingState)

func NewDeliveryState() VendingMachineState {
	return deliveryState{}
}

func (s deliveryState) HandleState(context *VendingMachine) {
	fmt.Println("deliveryState: Ürün teslim ediliyor.")
	context.SetState(NewWaitingState())
}
