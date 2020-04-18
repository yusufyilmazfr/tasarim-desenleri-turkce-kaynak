package State

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
internal class DeliveryState : VendingMachineState() {
    // DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
    // Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
    override fun handleState(context: VendingMachine) {
        println("DeliveryState: Ürün teslim ediliyor.")

        context.setState(WaitingState())
    }
}
