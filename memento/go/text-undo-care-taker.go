package main

// TextUndoCareTaker Memento'ların referansının tutulduğu yerdir.
// UML diyagramındaki CareTaker yapısına denk gelmektedir.
type TextUndoCareTaker struct {
	mementos *Stack
}

func NewTextUndoCareTaker() *TextUndoCareTaker {
	return &TextUndoCareTaker{
		mementos: &Stack{},
	}
}

// SetMemento Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.
// Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
// Klasik Stack.
func (t *TextUndoCareTaker) SetMemento(memento *TextMemento) {
	t.mementos.Push(memento)
}

func (t *TextUndoCareTaker) GetMemento() *TextMemento {
	return t.mementos.Pop()
}
