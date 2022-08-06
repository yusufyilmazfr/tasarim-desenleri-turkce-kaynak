package main

func main() {
	// Güncellemeden etkilenecek olan sınıf örnekleri.
	mehmet := NewObserverUser()
	derya := NewObserverUser()
	sema := NewObserverUser()
	aleyna := NewObserverUser()

	// İzlenecek olan sınıf örneği.
	smsng := NewSamsung()

	// İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
	smsng.ObservableProduct.AddObserver(mehmet)
	smsng.ObservableProduct.AddObserver(derya)
	smsng.ObservableProduct.AddObserver(sema)
	smsng.ObservableProduct.AddObserver(aleyna)

	smsng.ChangePrice()

	// output:
	//  Samsung updated. Message: Samsung's price updated.
	//  Samsung updated. Message: Samsung's price updated.
	//  Samsung updated. Message: Samsung's price updated.
	//  Samsung updated. Message: Samsung's price updated.
}
