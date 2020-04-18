package State;

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
class WaitingState extends VendingMachineState {
    // WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
    // Buradan sonraki durum gelen istek ile aksiyon alacaktır.
    @Override
    public void handleState(VendingMachine context) {
        System.out.println("WaitingState: Otomata herhangi bir aksiyon bekliyor.");
    }
}