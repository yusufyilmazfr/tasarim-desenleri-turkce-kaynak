using System;
using System.Collections.Generic;
using System.Text;

namespace State
{
    // Davranışların tanımlandığı soyut sınıftır.
    // UML diyagramındaki State yapısına denk gelmektedir.
    public abstract class VendingMachineState
    {
        public abstract void HandleState(VendingMachine context);
    }
}
