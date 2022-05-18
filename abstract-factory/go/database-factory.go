package main

// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
type databaseFactory interface {
	createConnection() connection
	createCommand() command
}
