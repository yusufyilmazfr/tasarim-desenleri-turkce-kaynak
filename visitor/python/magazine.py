# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from book import Book


class Magazine(Book):
    """
    UML diyagramındaki Element'ten türer.
    Accept metoduna bulunduğu nesne örneği gönderilir.
    UML diyagramındaki ConcreteElement yapısına denk gelir.
    """

    def accept(self, visitor):
        visitor.export_visit(self)
