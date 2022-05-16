import {TextMemento} from "./text-memento";

// Memento'ların referansının tutulduğu yerdir.
// UML diyagramındaki CareTaker yapısına denk gelmektedir.
export class  TextUndoCareTaker {
  private mementos: TextMemento[] = [];

  // Çağrılma işlemi yapıldığında yığının en üstündeki Memento örneği silinir ve geriye döndürülür.
  get textMemento() {
    return this.mementos.pop();
  }

  // Ekleme işlemi yapıldığında yığının en üstüne Memento örneği eklenir.
  set textMemento(value) {
    this.mementos.push(value);
  }
}
