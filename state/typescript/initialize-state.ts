import {VendingMachineState} from "./vending-machine-state";
import {VendingMachine} from "./vending-machine";
import {WaitingState} from "./waiting-state";

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
export class InitializeState extends VendingMachineState {
  // Başlangıç durumu ayarları yapıldıktan sonra WaitingState (hazır) durumuna geçer.
  public handleState(context: VendingMachine): void {
    console.log('InitializeState: Ön hazırlıklar yapılıyor.');

    context.setState(new WaitingState());
  }
}
