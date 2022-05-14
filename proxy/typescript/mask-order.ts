import {IOrderableMask} from "./orderable-mask.interface";
import {Person} from "./person";

// Maske siparişininin oluşturulduğu sınıf.
// İstemcinin direkt erişmesini istemediğimiz alandır.
// UML diyagramındaki ConcreteService sınıfına denk gelmektedir.
export class MaskOrder implements IOrderableMask{
  public createOrder(person: Person): void {
    // Burada siparişin oluşturulma işlemleri yer alacaktır.
    console.log(`Order created to ${person.address}`);
  }
}
