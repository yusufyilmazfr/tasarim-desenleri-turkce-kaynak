import {VendingMachineState} from "./vending-machine-state";
import {VendingMachine} from "./vending-machine";
import {DeliveryState} from "./delivery-state";

// Farklı durumların meydana geldiği sınıf.
// UML diyagramındaki State (VendingMachineState) yapısından türer.
// UML diyagramındaki ConcreteState yapısına denk gelmektedir.
export class PreparingState extends VendingMachineState {
  // PreparingState durumunda ürün hazırlanması gibi işlemler yapılmaktadır.
  // Buradan sonraki durum ise ürünün verilmesi durumudur. (DeliveryState)
  public handleState(context: VendingMachine): void {
    console.log('PreparingState: İstenilen ürün hazırlanıyor. Lütfen bekleyiniz');

    context.setState(new DeliveryState());
  }
}
