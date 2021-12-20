# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
class Person:
    """
    SYB: Diger tasarim desenlerinin implementasyonundan farkli olarak
    hazir uygulamasını gosteriyorken getter ve setter kavramini da uygulamak
    icin farklı bir kullanım yazdım. Class içerisinde çağırırken ya da
    değer ataması yaparken manipüle etmeye ihtiyaç duyduğumuz değişkenler için
    getter/setter kullanılır. Buradaki tc ve address değişkenlerini dışarıdan
    bir değişken gibi çağırabilirsiniz. Detaylı bilgi için:
    https://docs.python.org/3/howto/descriptor.html#properties

    Bu class ayrıca şöyle de yazılabilirdi:
    class Person:
    def __init__(self, tc, address):
        self.tc = tc
        self.address = address
    """

    def __init__(self, tc, address):
        self._tc = tc
        self._address = address

    @property
    def tc(self):
        return self._tc

    @tc.setter
    def tc(self, value):
        self._tc = value

    @property
    def address(self):
        return self._address

    @address.setter
    def address(self, value):
        self._address = value
