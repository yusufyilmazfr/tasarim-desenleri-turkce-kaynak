using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Farklı durumların meydana geldiği sınıf.
    // UML diyagramındaki State (VendingMachineState) yapısından türer.
    // UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    class WaitingState : VendingMachineState
    {
        // WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
        // Buradan sonraki durum gelen istek ile aksiyon alacaktır.
        public override void HandleState(VendingMachine context)
        {
            Console.WriteLine("WaitingState: Otomata herhangi bir aksiyon bekliyor.");
        }
    }
}
