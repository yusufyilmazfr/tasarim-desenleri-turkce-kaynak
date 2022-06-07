package main

import "fmt"

// initializeState Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
type initializeState struct{}

// Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.

func NewInitializeState() VendingMachineState {
	return initializeState{}
}

func (s initializeState) HandleState(context *VendingMachine) {
	fmt.Println("initializeState: Ön hazırlıklar yapılıyor.")
	context.SetState(NewWaitingState())
}
