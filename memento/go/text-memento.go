package main

// TextMemento Saklamak istediğimiz değerlerin tanımlandığı yerdir.
// UML diyagramındaki Memento yapısına denk gelir.
type TextMemento struct {
	Text           string
	CursorPosition int
}

func NewTextMemento() *TextMemento {
	return &TextMemento{
		Text:           "",
		CursorPosition: 0,
	}
}
