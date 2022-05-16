import {IOrderCommand} from "./order-command.interface";

// Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
// Metotun ne zaman çağrılacağını belirtir.
// UML diyagramındaki Invoker sınıfına denk gelmektedir.
export class StockController {
  private orderCommands: IOrderCommand[] = [];

  public takeOrder(command: IOrderCommand): void {
    this.orderCommands.push(command);
  }

  public placeOrders() {
    for (let command of this.orderCommands) {
      command.execute();
    }

    this.orderCommands = [];
  }
}
