package Visitor;

// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
class Encyclopedia extends Book {
    @Override
    public void accept(IBookExportVisitor visitor) {
        visitor.exportVisit(this);
    }
}