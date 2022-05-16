import { BoxColor } from "./box-color";

// Nesnenin ortak özelliklerini tutan sınıftır.
// UML diyagramındaki Flyweight yapısına denk gelmektedir.
export abstract class Box {
  public width: number;
  public height: number;
  public boxColor: BoxColor;

  public abstract draw(locationX: number, locationY: number): void;
}
