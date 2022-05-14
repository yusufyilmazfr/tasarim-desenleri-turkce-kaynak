import {IOrderCommand} from "./order-command.interface";
import {StockManager} from "./stock-manager";

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
export class BuyStock implements IOrderCommand{
  constructor(private readonly stockManager: StockManager) {}

  public async execute(): Promise<void> {
    await this.stockManager.buy();
  }
}
