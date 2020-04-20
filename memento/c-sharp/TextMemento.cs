using System;
using System.Collections.Generic;
using System.Text;

namespace Memento
{
    // Saklamak istediğimiz değerlerin tanımlandığı yerdir.
    // UML diyagramındaki Memento yapısına denk gelir.
    class TextMemento
    {
        public string Text { get; set; }
        public int CursorPosition { get; set; }
    }
}
