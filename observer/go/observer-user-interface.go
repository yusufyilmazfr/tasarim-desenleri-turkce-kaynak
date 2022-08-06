package main

// ObserverUser Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
// UML diyagramındaki Observer yapısına denk gelmektedir.
type ObserverUser interface {
	SendNotification(msg ProductUpdateMessage)
}
