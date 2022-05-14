import {IOrderableMask} from "./orderable-mask.interface";
import {Person} from "./person";
import {MaskOrder} from "./mask-order";

// İstemcinin muhatap olacağı sınıftır.
// Proxy sınıfımızdır.
// Gerçek işi yapan MaskOrder sınıfının referansını tutar.
// Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
export class AuthenticatableMaskOrderProxy implements IOrderableMask {
  private readonly orderMask = new MaskOrder();

  createOrder(person: Person): void {
    // Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
    const isValid = this.checkPersonIsValid(person);
    if(!isValid) throw new Error('Invalid Person!');

    this.orderMask.createOrder(person);
  }

  private checkPersonIsValid(person: Person) {
    // Burada Mernis servisleri ile iletişim sağlanabilir.
    // Örnek amaçlı TC numarasının 11 karakter olması yeterlidir.
    // Örnek amaçlı adres alanının boş olmaması yeterlidir.
    return person.TC.length === 11 && person.address !== '';
  }
}
