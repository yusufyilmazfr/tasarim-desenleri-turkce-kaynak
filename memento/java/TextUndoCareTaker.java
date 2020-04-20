package Memento;

import java.util.Stack;

// Memento'ların referansının tutulduğu yerdir.
// UML diyagramındaki CareTaker yapısına denk gelmektedir.
class TextUndoCareTaker {
    private Stack<TextMemento> _mementos;

    public TextUndoCareTaker() {
        _mementos = new Stack<TextMemento>();
    }

    // Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.
    // Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
    // Klasik Stack.

    public void setMemento(TextMemento memento) {
        _mementos.push(memento);
    }

    public TextMemento getMemento() {
        return _mementos.pop();
    }
}