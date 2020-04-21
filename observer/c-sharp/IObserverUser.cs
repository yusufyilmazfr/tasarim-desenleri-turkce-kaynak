using System;
using System.Collections.Generic;
using System.Text;

namespace Observer
{
    // Değişimden etkilenecek, izleyecek olan sınıfların uyguladığı arayüzdür.
    // UML diyagramındaki Observer yapısına denk gelmektedir.
    interface IObserverUser
    {
        void SendNotification(ProductUpdateMessage message);
    }
}