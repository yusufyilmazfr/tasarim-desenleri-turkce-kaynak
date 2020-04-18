package State

// Davranışların tanımlandığı soyut sınıftır.
// UML diyagramındaki State yapısına denk gelmektedir.
abstract class VendingMachineState {
    abstract fun handleState(context: VendingMachine)
}