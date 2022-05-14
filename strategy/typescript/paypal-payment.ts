import {IPayment} from "./payment.interface";

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
export class PaypalPayment implements IPayment {
  constructor(
    private readonly email: string,
    private readonly password: string,
  ) {}

  public pay(amount: number): void {
    // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
    console.log('Paid by Paypal.');
  }
}
