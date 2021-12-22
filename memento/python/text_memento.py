# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
class TextMemento:
    """
    Saklamak istediğimiz değerlerin tanımlandığı yerdir.
    UML diyagramındaki Memento yapısına denk gelir.
    """
    text: str
    cursor_position: int

    def __init__(self, text: str, cursor_position: int):
        self.text = text
        self.cursor_position = cursor_position
