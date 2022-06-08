package main

import "fmt"

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
type xmlExportVisitor struct{}

func NewXMLExportVisitor() *xmlExportVisitor {
	return &xmlExportVisitor{}
}

func (v *xmlExportVisitor) exportVisit(book Book) {
	// Parametre olarak gelen örneğin XML'a çevrilmesi işlemleri yer alacaktır.
	fmt.Println(book.GetName(), "exported by xmlExportVisitor")
}
