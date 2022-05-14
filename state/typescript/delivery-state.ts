import {VendingMachineState} from "./vending-machine-state";
import {VendingMachine} from "./vending-machine";
import {WaitingState} from "./waiting-state";

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
export class DeliveryState extends VendingMachineState {
  // DeliveryState durumunda otomatadan ürünün teslim işlemleri yapılmaktadır.
  // Ürün verildikten sonra başlangıç, bekleme durumuna geçmektedir. (WaitingState)
  public handleState(context: VendingMachine): void {
    console.log('DeliveryState: Ürün teslim ediliyor.');

    context.setState(new WaitingState());
  }
}
