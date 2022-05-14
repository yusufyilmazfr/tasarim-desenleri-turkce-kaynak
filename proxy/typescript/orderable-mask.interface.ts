import {Person} from "./person";

// Sipariş işlemlerini gerçekleştiren sınıflar tarafından uygulanan arayüz.
// UML diyagramındaki Service arayüzüne denk gelmektedir.
export interface IOrderableMask {
  createOrder(person: Person): void;
}
