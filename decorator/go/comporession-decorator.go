package main

import "fmt"

// Yeni davranışların tanımlandığı sınıftır.
// UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.
type compressionDecorator struct {
	ds DataSource
}

func NewCompressionDecorator(ds DataSource) *compressionDecorator {
	return &compressionDecorator{ds: ds}
}

func (c compressionDecorator) ReadData() {
	// Veriyi okurken referansını tuttuğumuz struct'ın kendi davranışını sergilemesini istiyoruz.
	c.ds.ReadData()
}

func (c *compressionDecorator) WriteData(data []byte) {
	// Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
	fmt.Println("Data compressed.")

	// Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
	fmt.Println("Compressed data was written to " + c.ds.GetFileName())
}
