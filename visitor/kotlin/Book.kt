package Visitor

// Temel sınıftır.
// Yeni davranışları Accept metotu ile alır.
// UML diyagramındaki Element yapısına denk gelmektedir.
internal abstract class Book {
    var name: String? = null
    var author: String? = null
    var categoryName: String? = null

    abstract fun accept(visitor: IBookExportVisitor)
}