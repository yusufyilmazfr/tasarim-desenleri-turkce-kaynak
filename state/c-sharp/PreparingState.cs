using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Farklı durumların meydana geldiği sınıf.
    // UML diyagramındaki State (VendingMachineState) yapısından türer.
    // UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    class PreparingState : VendingMachineState
    {
        // PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
        // Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState) 
        public override void HandleState(VendingMachine context)
        {
            Console.WriteLine("PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz");

            context.SetState(new DeliveryState());
        }
    }
}
