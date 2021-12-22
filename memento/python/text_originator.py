# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from text_undo_care_taker import TextUndoCareTaker
from text_memento import TextMemento


class TextOriginator:
    """
    Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
    UML diyagramındaki Originator yapısına denk gelmektedir.
    Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
    """
    text: str
    cursor_position: int

    def __init__(self):
        self._text_care_taker = TextUndoCareTaker()

    # Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
    def save(self):
        self._text_care_taker.text_memento = TextMemento(text=self.text,
                                                         cursor_position=self.cursor_position)

    # Geri alma işleminde yığının en üstündeki değeri alır.
    # Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
    def undo(self):
        previous_text_memento: TextMemento = self._text_care_taker.text_memento
        self.cursor_position = previous_text_memento.cursor_position
        self.text = previous_text_memento.text

    """
    SYB: main fonksiyonu içerisinde class'ı ismiyle çağırdığınızda dönecek olan string değeri
    str magic metodu ile manipüle ederek direkt çağırabilirsiniz. Anlatımda geçen örneğe
    sadık kalınmak istendiği takdirde aşağıdaki metod yerine "to_string" isimli bir metod
    oluşturarak app.py içerisinde print aşamalarında "text_originator.to_string()" denilerek
    örnek birebir tekrar edilebilecekken, bu şekilde değere ulaşılması daha işlevsel olacağından
    str metodu override edilerek yazılmıştır. 
    """

    def __str__(self):
        return f"text: {self.text}, cursor position: {self.cursor_position}"
