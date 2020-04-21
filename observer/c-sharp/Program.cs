using System;
using System.Collections.Generic;

namespace Observer
{
    class Program
    {
        static void Main(string[] args)
        {
            // Güncellemeden etkilenecek olan sınıf örnekleri.
            IObserverUser mehmet = new ObserverUser();
            IObserverUser derya = new ObserverUser();
            IObserverUser sema = new ObserverUser();
            IObserverUser aleyna = new ObserverUser();


            // İzlenecek olan sınıf örneği.
            Samsung samsung = new Samsung();

            // İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
            samsung.AddObserver(mehmet);
            samsung.AddObserver(derya);
            samsung.AddObserver(sema);
            samsung.AddObserver(aleyna);

            samsung.ChangePrice();

            // output:
            //  Samsung updated. Message: Samsung's price updated.
            //  Samsung updated. Message: Samsung's price updated.
            //  Samsung updated. Message: Samsung's price updated.
            //  Samsung updated. Message: Samsung's price updated.
        }
    }
}
