from mask_order import MaskOrder
from orderable_mask import OrderableMask
from proxy.python.person import Person


class AuthenticatableMaskOrderProxy(OrderableMask):
    """
    İstemcinin muhatap olacağı sınıftır.
    Proxy sınıfımızdır.
    Gerçek işi yapan MaskOrder sınıfının referansını tutar.
    Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
    """

    def __init__(self):
        self._order_mask = MaskOrder()

    def create_order(self, person: Person):
        is_valid = self.check_person_is_valid(person)
        if is_valid:
            self._order_mask.create_order(person)
        """
        SYB: bu kod soyle daha kisa ve anlasilir yazılabilirdi. Gosterim acisinden
        netligin saglanmasi icin C# koduna sadık kalindi:
        def create_order(self, person: Person):
            if self.check_person_is_valid(person):
                self._order_mask.create_order(person)
        """

    def check_person_is_valid(self, person):
        """
        Burada Mernis servisleri ile iletişim sağlanabilir.
        Örnek amaçlı TC numarasının 11 karakter olması yeterlidir.
        Örnek amaçlı adres alanının boş olmaması yeterlidir.
        """
        return len(person.tc) == 11 and person.address != ""
