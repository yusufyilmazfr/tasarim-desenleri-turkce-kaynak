package main

import "fmt"

// preparingState Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
type preparingState struct{}

// preparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
// Buradan sonraki durum ise ürünün verilmesi durumudur. (deliveryState)

func NewPreparingState() VendingMachineState {
	return preparingState{}
}

func (s preparingState) HandleState(context *VendingMachine) {
	fmt.Println("preparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz")
	context.SetState(NewDeliveryState())
}
