using System;
using System.Collections.Generic;
using System.Text;

namespace Command
{
    // Temel arayüzdür.
    // Komutların çalıştırılması için temel metotu içermektedir.
    // UML diyagramındaki Command arayüzüne denk gelmektedir.
    interface IOrderCommand
    {
        void Execute();
    }
}
