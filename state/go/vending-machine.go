package main

// VendingMachine Durumu izlenecek olan sınıftır.
// UML diyagramındaki Context yapısına denk gelmektedir.
type VendingMachine struct {
	state VendingMachineState
}

// NewVendingMachine Otomat örneği oluştuğu zaman başlangıç durumuna geçiyor.
func NewVendingMachine() *VendingMachine {
	vm := &VendingMachine{}
	vm.SetState(NewInitializeState())
	return vm
}

func (m *VendingMachine) SetState(state VendingMachineState) {
	m.state = state
	m.state.HandleState(m)
}

func (m *VendingMachine) RequestProduct(_ string, _ int) {
	// Burada ürünlere ait iş kodları olacaktır.
	// Ürün kontrolü, fiyatlandırma gibi kontroller.
	// Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.

	m.SetState(NewPreparingState())
}
