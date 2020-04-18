using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Farklı durumların meydana geldiği sınıf.
    // UML diyagramındaki State (VendingMachineState) yapısından türer.
    // UML diyagramındaki ConcreteState yapısına denk gelmektedir.
    class InitializeState : VendingMachineState
    {
        // Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
        public override void HandleState(VendingMachine context)
        {
            Console.WriteLine("InitializeState: Ön hazırlıklar yapılıyor.");

            context.SetState(new WaitingState());
        }
    }
}
