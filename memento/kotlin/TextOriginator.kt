package Memento

// Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
// UML diyagramındaki Originator yapısına denk gelmektedir.
// Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
internal class TextOriginator {
    var text: String? = null
    var cursorPosition: Int = 0

    private val _textCareTaker: TextUndoCareTaker = TextUndoCareTaker()

    // Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
    fun save() {
        val textMemento = TextMemento()
        textMemento.cursorPosition = this.cursorPosition
        textMemento.text = this.text

        _textCareTaker.memento = textMemento
    }

    // Geri alma işlemi gerçekleştiğinde UML diyagramındaki CareTaker üzerinden yığının en üstündeki değeri alır.
    // Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
    fun undo() {
        val previousTextMemento = _textCareTaker.memento

        cursorPosition = previousTextMemento.cursorPosition
        text = previousTextMemento.text
    }

    fun ToString(): String {
        return String.format("text: %s, cursor position: %d", text, cursorPosition)
    }
}