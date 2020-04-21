package Visitor

// Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
internal interface IBookExportVisitor {
    fun exportVisit(magazine: Magazine)
    fun exportVisit(encyclopedia: Encyclopedia)
}