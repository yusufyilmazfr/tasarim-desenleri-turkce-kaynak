package main

// BookExportVisitor Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
type BookExportVisitor interface {
	exportVisit(book Book)
}
