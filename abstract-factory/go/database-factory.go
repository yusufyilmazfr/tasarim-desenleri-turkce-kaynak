package main

// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
type DatabaseFactory interface {
	createConnection() Connection
	createCommand() Command
}
