import {IPayment} from "./payment.interface";

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
export class CreditCartPayment implements IPayment {
  constructor(
    private readonly name: string,
    private readonly cardNumber: string,
    private readonly cvv: string,
    private readonly dateOfExpiry: string,
  ) {}

  public pay(amount: number): void {
    // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
    console.log('Paid by Credit Cart.');
  }
}
