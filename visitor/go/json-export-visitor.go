package main

import "fmt"

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
type jsonExportVisitor struct{}

func NewJSONExportVisitor() *jsonExportVisitor {
	return &jsonExportVisitor{}
}

func (j *jsonExportVisitor) exportVisit(book Book) {
	// Parametre olarak gelen örneğin JSON'a çevrilmesi işlemleri yer alacaktır.
	fmt.Println(book.GetName(), "exported by jsonExportVisitor")
}
