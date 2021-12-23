class StockManager:
    """
    Komutları nesneler haline getirelecek olan sınıf.
    UML diyagramındaki Receiver sınıfına denk gelmektedir.
    """

    def __init__(self, name: str, quantity: int):
        self._name = name
        self._quantity = quantity

    def buy(self):
        print(f"Stock: {self._name}, {self._quantity} bought!")

    def sell(self):
        print(f"Stock: {self._name}, {self._quantity} sold!")
