package State

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
internal class WaitingState : VendingMachineState() {
    // WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
    // Buradan sonraki durum gelen istek ile aksiyon alacaktır.
    override fun handleState(context: VendingMachine) {
        println("WaitingState: Otomata herhangi bir aksiyon bekliyor.")
    }
}