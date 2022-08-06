package main

import "fmt"

// waitingState Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
type waitingState struct{}

// waitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
// Buradan sonraki durum gelen istek ile aksiyon alacaktır.

func NewWaitingState() VendingMachineState {
	return waitingState{}
}

func (s waitingState) HandleState(_ *VendingMachine) {
	fmt.Println("waitingState: Otomata herhangi bir aksiyon bekliyor.")
}
