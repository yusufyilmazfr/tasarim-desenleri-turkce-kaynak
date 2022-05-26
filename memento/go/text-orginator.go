package main

import "fmt"

// TextOrginator Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
// UML diyagramındaki Originator yapısına denk gelmektedir.
// Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
type TextOrginator struct {
	Text           string
	CursorPosition int
	TextCareTaker  *TextUndoCareTaker
}

func NewTextOrginator() *TextOrginator {
	return &TextOrginator{
		TextCareTaker: NewTextUndoCareTaker(),
	}
}

// Save : Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
func (o *TextOrginator) Save() {
	txtMemento := NewTextMemento()
	txtMemento.Text = o.Text
	txtMemento.CursorPosition = o.CursorPosition

	o.TextCareTaker.SetMemento(txtMemento)
}

// Undo : Geri alma işlemi gerçekleştiğinde UML diyagramındaki CareTaker üzerinden yığının en üstündeki değeri alır.
// Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
func (o *TextOrginator) Undo() {
	txtMemento := o.TextCareTaker.GetMemento()
	o.Text = txtMemento.Text
	o.CursorPosition = txtMemento.CursorPosition
}

func (o TextOrginator) ToString() string {
	return fmt.Sprintf("text: %s, cursor position: %d", o.Text, o.CursorPosition)
}
