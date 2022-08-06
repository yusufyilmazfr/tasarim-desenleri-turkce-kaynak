package main

func main() {
	vendingMachine := NewVendingMachine()
	vendingMachine.RequestProduct("COVID-19 MASKE", 2)
	// output:
	//  initializeState: Ön hazırlıklar yapılıyor.
	//  waitingState: Otomata herhangi bir aksiyon bekliyor.
	//  preparingState: İstenilen ürün hazırlanıyor.Lütfen bekleyiniz
	//  deliveryState: Ürün teslim ediliyor.
	//  waitingState: Otomata herhangi bir aksiyon bekliyor.
}
