package main

// DataSource arayüzünde yapılacak temel işlemler tanımlanmıştır.
// UML diyagramındaki Component arayüzüne denk gelmektedir.
type DataSource interface {
	GetFileName() string
	WriteData(data []byte)
	ReadData()
}
