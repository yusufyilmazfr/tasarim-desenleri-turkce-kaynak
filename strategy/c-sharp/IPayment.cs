using System;
using System.Collections.Generic;
using System.Text;

namespace Strategy
{
    // UML diyagramındaki Strategy arayüzüne denk gelmektedir.
    // Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
    interface IPayment
    {
        void Pay(int amount);
    }
}
