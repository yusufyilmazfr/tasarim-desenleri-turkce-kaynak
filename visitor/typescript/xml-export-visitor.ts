import {IBookExportVisitor} from "./book-export-visitor.interface";
import {Magazine} from "./magazine";
import {Encyclopedia} from "./encyclopedia";

// Visitor arayüzünü ve burada tanımlı olan metotları uygular.
// Sonradan eklenmek istenen işlemler burada yer alır.
// UML diyagramındaki ConcreteVisitor yapısına denk gelir.
export class XmlExportVisitor implements IBookExportVisitor {
  public exportVisit(encyclopedia: Encyclopedia): void;
  public exportVisit(magazine: Magazine): void;

  public exportVisit(book: Encyclopedia | Magazine): void {
    // Parametre olarak gelen örneğin XML'e çevrilmesi işlemleri yer alacaktır.
    console.log(`${book.name} exported by XmlExportVisitor`);
  }
}
