package State;

// Davranışların tanımlandığı soyut sınıftır.
// UML diyagramındaki State yapısına denk gelmektedir.
public abstract class VendingMachineState
{
    public abstract void handleState(VendingMachine context);
}