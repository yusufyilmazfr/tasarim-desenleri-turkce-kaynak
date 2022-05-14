import {TextUndoCareTaker} from "./text-undo-care-taker";
import {TextMemento} from "./text-memento";

// Değerleri tutulacak olan ve önceki değerlerine geri dönebilen sınıftır.
// UML diyagramındaki Originator yapısına denk gelmektedir.
// Geriye dönebilme özelliği olduğundan önceki durumları tutan CareTaker referansını tutmaktadır.
export class TextOriginator {
  public text: string;
  public cursorPosition: number;
  private textCareTaker = new TextUndoCareTaker();

  // Anlık kayıt değerlerini UML diyagramındaki CareTaker üzerinden yığına eklemektedir.
  public save(): void {
    const textMemento = new TextMemento();
    textMemento.text = this.text;
    textMemento.cursorPosition = this.cursorPosition;
    this.textCareTaker.textMemento = textMemento;
  }

  // Geri alma işlemi gerçekleştiğinde UML diyagramındaki CareTaker üzerinden yığının en üstündeki değeri alır.
  // Değer alma işleminden sonra sınıfın mevcut değerlerine atanır.
  public undo(): void {
    const previousTextMemento = this.textCareTaker.textMemento;

    this.cursorPosition = previousTextMemento.cursorPosition;
    this.text = previousTextMemento.text;
  }

  public toString(): string {
    return `text: ${this.text}, cursor position: ${this.cursorPosition}`;
  }
}
