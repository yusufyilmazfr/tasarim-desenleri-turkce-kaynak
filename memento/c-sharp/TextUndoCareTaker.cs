using System;
using System.Collections.Generic;
using System.Text;

namespace Memento
{
    // Memento'ların referansının tutulduğu yerdir.
    // UML diyagramındaki CareTaker yapısına denk gelmektedir.
    class TextUndoCareTaker
    {
        private Stack<TextMemento> _mementos;

        public TextUndoCareTaker()
        {
            _mementos = new Stack<TextMemento>();
        }

        // Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.
        // Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
        // Klasik Stack.
        public TextMemento TextMemento
        {
            get
            {
                return _mementos.Pop();
            }
            set
            {
                _mementos.Push(value);
            }
        }
    }
}
