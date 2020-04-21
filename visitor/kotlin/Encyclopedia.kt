package Visitor

// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
internal class Encyclopedia : Book() {
    override fun accept(visitor: IBookExportVisitor) {
        visitor.exportVisit(this)
    }
}