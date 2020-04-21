package Visitor;

// Temel sınıftır.
// Yeni davranışları Accept metotu ile alır.
// UML diyagramındaki Element yapısına denk gelmektedir.
abstract class Book
{
    public String name;
    public String author;
    public String categoryName;

    public abstract void accept(IBookExportVisitor visitor);
}