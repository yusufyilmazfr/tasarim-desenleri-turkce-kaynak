# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from payment import Payment


class PaypalPayment(Payment):
    """
    UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
    UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
    """

    def __init__(self, email: str, password: str):
        # SYB: diger tasarim desenlerinde yapıldığı gibi burada da _email ve _password
        # degiskenleri init'in üzerinde email:str şeklinde tanımlanabilirdi, ancak
        # burada init içerisinde zaten değer atama işlemi yapıldığı için, ekstra
        # olarak class altında tanımlamaya gerek duymadım.
        self._email = email
        self._password = password

    def pay(self, amount: int):
        # Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        print("Paid by Paypal.")
