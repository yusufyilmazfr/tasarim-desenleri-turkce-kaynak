using System;
using System.Collections.Generic;
using System.Text;

namespace Proxy
{
    // Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
    // UML diyagramındaki Service arayüzüne denk gelmektedir.
    interface IOrderableMask
    {
        void CreateOrder(Person person);
    }
}
