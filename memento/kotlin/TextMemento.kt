package Memento

// Saklamak istediğimiz değerlerin tanımlandığı yerdir.
// UML diyagramındaki Memento yapısına denk gelir.
internal class TextMemento {
    var text: String? = null
    var cursorPosition: Int = 0
}