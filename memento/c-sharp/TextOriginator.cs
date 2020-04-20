using System;
using System.Collections.Generic;
using System.Text;

namespace Memento
{
    // Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
    // UML diyagramındaki Originator yapısına denk gelmektedir.
    // Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
    class TextOriginator
    {
        public string Text { get; set; }
        public int CursorPosition { get; set; }

        private TextUndoCareTaker _textCareTaker;

        public TextOriginator()
        {
            _textCareTaker = new TextUndoCareTaker();
        }

        // Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
        public void Save()
        {
            _textCareTaker.TextMemento = new TextMemento
            {
                CursorPosition = this.CursorPosition,
                Text = this.Text
            };
        }

        // Geri alma işlemi gerçekleştiğinde UML diyagramındaki CareTaker üzerinden yığının en üstündeki değeri alır.
        // Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
        public void Undo()
        {
            TextMemento previousTextMemento = _textCareTaker.TextMemento;

            CursorPosition = previousTextMemento.CursorPosition;
            Text = previousTextMemento.Text;
        }

        public override string ToString()
        {
            return $"text: {Text}, cursor position: {CursorPosition}";
        }
    }
}
