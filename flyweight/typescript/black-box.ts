import {Box} from "./box";
import {BoxColor} from "./box-color";

// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
export class BlackBox extends Box {
  constructor(readonly width, readonly height) {
    super();
    this.width = width;
    this.height = height;
    this.boxColor = BoxColor.BLACK;
  }

  public draw(locationX: number, locationY: number): void {
    console.log(`${this.boxColor} box drawn. ${locationX},${locationY}`)
  }
}
