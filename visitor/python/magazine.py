from book import Book


class Magazine(Book):
    """
    UML diyagramındaki Element'ten türer.
    Accept metoduna bulunduğu nesne örneği gönderilir.
    UML diyagramındaki ConcreteElement yapısına denk gelir.
    """

    def accept(self, visitor):
        visitor.export_visit(self)
