import {Item} from "./item";
import {IPayment} from "./payment.interface";

// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
export class ShoppingCart {
  private items: Item[] = [];
  private payment: IPayment;

  public setPaymentMethod(payment: IPayment): void {
    this.payment = payment;
  }

  public addItem(item: Item): void {
    this.items.push(item);
  }

  public calculateTotal(): number {
    let sum = 0;
    for (let item of this.items){
      sum += item.getPrice();
    }
    return sum;
  }

  public pay(): void {
    const amount = this.calculateTotal();
    this.payment.pay(amount);
  }
}
