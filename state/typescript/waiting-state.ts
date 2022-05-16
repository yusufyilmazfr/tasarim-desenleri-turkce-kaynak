import {VendingMachineState} from "./vending-machine-state";
import {VendingMachine} from "./vending-machine";

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
export class WaitingState extends VendingMachineState {
  // WaitingState durumunda herhangi bir yeni duruma geçmeye gerek yok.
  // Buradan sonraki durum gelen istek ile aksiyon alacaktır.
  public handleState(context: VendingMachine): void {
    console.log('WaitingState: Otomata herhangi bir aksiyon bekliyor.');
  }
}
