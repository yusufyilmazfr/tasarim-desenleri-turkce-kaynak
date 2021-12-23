from payment import Payment


class CreditCartPayment(Payment):
    """
    UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
    UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
    """

    def __init__(self, name: str, cc_num: str, cvv: str, expiry_date: str):
        self._name = name
        self._cc_num = cc_num
        self._cvv = cvv
        self._expiry_date = expiry_date

    def pay(self, amount: int):
        # Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        print("Paid by credit cart.")
