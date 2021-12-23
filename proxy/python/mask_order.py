from orderable_mask import OrderableMask
from proxy.python.person import Person


class MaskOrder(OrderableMask):
    """
    Maske siparişininin oluşturulduğu sınıf.
    İstemcinin direkt erişmesini istemediğimiz alandır.
    UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
    """

    def create_order(self, person: Person):
        # Burada siparişin oluşturulma işlemleri yer alacaktır.
        print(f"Order created to {person.address}.")
