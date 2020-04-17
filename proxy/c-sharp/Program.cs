using System;

namespace Proxy
{
    class Program
    {
        static void Main(string[] args)
        {
            Person semanur = new Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz");

            IOrderableMask orderableMask = new AuthenticatableMaskOrderProxy();

            orderableMask.CreateOrder(semanur);
            // output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz.
        }
    }
}
