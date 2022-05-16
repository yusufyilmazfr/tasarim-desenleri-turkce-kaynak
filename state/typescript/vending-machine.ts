import {VendingMachineState} from "./vending-machine-state";
import {InitializeState} from "./initialize-state";
import {PreparingState} from "./preparing-state";

// Durumu izlenecek olan sınıftır.
// UML diyagramındaki Context yapısına denk gelmektedir.
export class VendingMachine {
  private state: VendingMachineState;

  constructor() {
    // Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
    this.setState(new InitializeState());
  }

  public setState(state: VendingMachineState): void {
    this.state = state;
    this.state.handleState(this);
  }

  public requestProduct(productName: string, price: number): void {
    // Burada ürünlere ait iş kodları olacaktır.
    // Ürün kontrolü, fiyatlandırma gibi kontroller.
    // Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.
    this.setState(new PreparingState())
  }
}
