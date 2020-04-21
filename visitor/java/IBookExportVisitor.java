package Visitor;

// Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
interface IBookExportVisitor {
    void exportVisit(Magazine magazine);
    void exportVisit(Encyclopedia encyclopedia);
}