import {Book} from "./book";

// Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
export interface IBookExportVisitor {
  exportVisit(magazine: Book): void;
}
