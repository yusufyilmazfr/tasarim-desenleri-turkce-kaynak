import {Encyclopedia} from "./encyclopedia";
import {Magazine} from "./magazine";

// Her ConcreteVisitor örneği için metot temsil eder.
// Parametre olarak Element sınıfından türeyen sınıfların örneğini alır.
// UML diyagramındaki Visitor yapısına denk gelir.
export interface IBookExportVisitor {
  exportVisit(encyclopedia: Encyclopedia): void;
  exportVisit(magazine: Magazine): void;
}
