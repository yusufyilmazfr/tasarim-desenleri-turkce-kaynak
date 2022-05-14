import {IBookExportVisitor} from "./book-export-visitor.interface";

// Temel sınıftır.
// Yeni davranışları Accept metotu ile alır.
// UML diyagramındaki Element yapısına denk gelmektedir.
export abstract class Book {
  public name: string;
  public author: string;
  public categoryName: string;

  public abstract accept(visitor: IBookExportVisitor): void;
}
