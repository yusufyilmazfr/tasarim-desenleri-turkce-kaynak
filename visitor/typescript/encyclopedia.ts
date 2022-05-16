import {Book} from "./book";
import {IBookExportVisitor} from "./book-export-visitor.interface";

// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
export class Encyclopedia extends Book {
  public accept(visitor: IBookExportVisitor): void {
    visitor.exportVisit(this);
  }
}
