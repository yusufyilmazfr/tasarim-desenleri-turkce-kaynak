package Memento

import java.util.Stack

// Memento'ların referansının tutulduğu yerdir.
// UML diyagramındaki CareTaker yapısına denk gelmektedir.
internal class TextUndoCareTaker {
    private val _mementos: Stack<TextMemento>

    // Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.
    // Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
    // Klasik Stack.

    var memento: TextMemento
        get() = _mementos.pop()
        set(memento) {
            _mementos.push(memento)
        }

    init {
        _mementos = Stack()
    }
}