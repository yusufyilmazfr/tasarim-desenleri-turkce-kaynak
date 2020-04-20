package Memento;

// Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
// UML diyagramındaki Originator yapısına denk gelmektedir.
// Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
class TextOriginator {
    public String text;

    public int cursorPosition;

    private TextUndoCareTaker _textCareTaker;

    public TextOriginator() {
        _textCareTaker = new TextUndoCareTaker();
    }

    // Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
    public void save() {
        TextMemento textMemento = new TextMemento();
        textMemento.cursorPosition = this.cursorPosition;
        textMemento.text = this.text;

        _textCareTaker.setMemento(textMemento);
    }

    // Geri alma işlemi gerçekleştiğinde UML diyagramındaki CareTaker üzerinden yığının en üstündeki değeri alır.
    // Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
    public void undo() {
        TextMemento previousTextMemento = _textCareTaker.getMemento();

        cursorPosition = previousTextMemento.cursorPosition;
        text = previousTextMemento.text;
    }

    public String ToString() {
        return String.format("text: %s, cursor position: %d", text, cursorPosition);
    }
}