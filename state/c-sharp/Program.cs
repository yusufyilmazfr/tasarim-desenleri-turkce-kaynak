using System;

namespace State
{
    class Program
    {
        static void Main(string[] args)
        {
            VendingMachine vendingMachine = new VendingMachine();
            vendingMachine.RequestProduct("COVID-19 MASKE", 2);

            // output:
            //  InitializeState: Ön hazırlıklar yapılıyor.
            //  WaitingState: Otomata herhangi bir aksiyon bekliyor.
            //  PreparingState: İstenilen ürün hazırlanıyor.Lütfen bekleyiniz
            //  DeliveryState: Ürün teslim ediliyor.
            //  WaitingState: Otomata herhangi bir aksiyon bekliyor.
        }
    }
}
