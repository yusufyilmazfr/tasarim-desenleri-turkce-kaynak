package State;

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class InitializeState extends VendingMachineState {
    // Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
    @Override
    public void handleState(VendingMachine context) {
        System.out.println("InitializeState: Ön hazırlıklar yapılıyor.");

        context.setState(new WaitingState());
    }
}