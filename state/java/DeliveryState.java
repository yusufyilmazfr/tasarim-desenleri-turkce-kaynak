package State;

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class DeliveryState extends VendingMachineState {
    // DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
    // Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
    @Override
    public void handleState(VendingMachine context) {
        System.out.println("DeliveryState: Ürün teslim ediliyor.");

        context.setState(new WaitingState());
    }
}
