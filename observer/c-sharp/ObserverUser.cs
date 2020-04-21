using System;
using System.Collections.Generic;
using System.Text;

namespace Observer
{
    // Observer arayüzünü uygulayan, değişimi takip eden sınıflardır.
    // Değişim update metotu ile bildirilir.
    // UML diyagramındaki ConcreteObserver yapısına denk gelmektedir.
    class ObserverUser : IObserverUser
    {
        public void SendNotification(ProductUpdateMessage message)
        {
            Console.WriteLine(message.ToString());
        }
    }
}
