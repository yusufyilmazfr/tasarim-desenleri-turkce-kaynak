using System;
using System.Collections.Generic;
using System.Text;

namespace Proxy
{
    // Maske siparişininin oluşturulduğu sınıf.
    // İstemcinin direkt erişmesini istemediğimiz alandır.
    // UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
    class MaskOrder : IOrderableMask
    {
        public void CreateOrder(Person person)
        {
            // Burada siparişin oluşturulma işlemleri yer alacaktır.
            Console.WriteLine($"Order created to {person.Address}.");
        }
    }
}
