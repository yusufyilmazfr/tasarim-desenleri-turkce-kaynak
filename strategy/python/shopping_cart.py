# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from payment import Payment
from item import Item


class ShoppingCart:
    """
    UML diyagramındaki Context sınıfına denk gelmektedir.
    UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
    """
    _items: list
    _payment: Payment

    def __init__(self):
        self._items = []

    def set_payment_method(self, payment: Payment):
        self._payment = payment

    def add_item(self, item: Item):
        self._items.append(item)

    def calculate_total(self):
        sum_price = 0
        for item in self._items:
            sum_price += item.get_price()
        """
        SYB: Kodun c# tarafındaki aslına sadık kalmak adına birebir yazdım. Ancak bu hesaplama
        daha pythonic bir şekilde şöyle tek satırda yapılabilirdi:
        return sum([item.get_price() for item in self._items])
        """
        return sum_price

    def pay(self):
        amount = self.calculate_total()
        self._payment.pay(amount)
