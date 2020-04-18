package State;

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class PreparingState extends VendingMachineState {
    // PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
    // Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState)
    @Override
    public void handleState(VendingMachine context) {
        System.out.println("PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz");

        context.setState(new DeliveryState());
    }
}