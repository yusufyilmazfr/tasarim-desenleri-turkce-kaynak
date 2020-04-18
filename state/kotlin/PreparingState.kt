package State

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
internal class PreparingState : VendingMachineState() {
    // PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
    // Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState)
    override fun handleState(context: VendingMachine) {
        println("PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz")

        context.setState(DeliveryState())
    }
}