using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Farklı durumların meydana geldiği sınıf.
    // UML diyagramındaki State (VendingMachineState) yapısından türer.
    // UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    class DeliveryState : VendingMachineState
    {
        // DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
        // Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
        public override void HandleState(VendingMachine context)
        {
            Console.WriteLine("DeliveryState: Ürün teslim ediliyor.");

            context.SetState(new WaitingState());
        }
    }
}
