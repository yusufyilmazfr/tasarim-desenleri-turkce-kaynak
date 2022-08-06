package main

// VendingMachineState Davranışların  tanımlandığı arayüzdür.
// UML diyagramındaki State yapısına denk gelmektedir.
type VendingMachineState interface {
	HandleState(context *VendingMachine)
}
