class Item:
    """
    Sepette bulunan ürünleri temsil eden sınıf.
    Ürün kodu ve fiyat bilgisi temel olarak yeterlidir.
    """

    def __init__(self, up_code, price):
        self._up_code = up_code
        self._price = price

    def get_price(self):
        return self._price
