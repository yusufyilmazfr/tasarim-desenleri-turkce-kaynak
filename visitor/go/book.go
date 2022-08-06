package main

// Book Temel arayüzdür.
// Yeni davranışları Accept metotu ile alır.
// UML diyagramındaki Element yapısına denk gelmektedir.
type Book interface {
	Accept(visitor BookExportVisitor)
	GetName() string
}
