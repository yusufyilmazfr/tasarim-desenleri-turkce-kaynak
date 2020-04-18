package State

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
internal class InitializeState : VendingMachineState() {
    // Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
    override fun handleState(context: VendingMachine) {
        println("InitializeState: Ön hazırlıklar yapılıyor.")

        context.setState(WaitingState())
    }
}