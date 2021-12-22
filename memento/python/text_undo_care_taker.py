# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
class TextUndoCareTaker:
    """
    Memento'ların referansının tutulduğu yerdir.
    UML diyagramındaki CareTaker yapısına denk gelmektedir.
    """

    def __init__(self):
        self._mementos = []

    # Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.

    # Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
    # Klasik Stack.
    @property
    def text_memento(self):
        return self._mementos.pop()

    @text_memento.setter
    def text_memento(self, value):
        self._mementos.append(value)
