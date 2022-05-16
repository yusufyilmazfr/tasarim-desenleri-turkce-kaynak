import {BoxColor} from "./box-color";
import {Box} from "./box";
import {BlackBox} from "./black-box";
import {BlueBox} from "./blue-box";

// Flyweight (Box) havuzunu tutacak sınıftır.
// Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
// Oluşturulmuş ise de havuzdan seçilip verilecektir.
// UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir.
export class BoxFactory {
  private readonly boxes: Map<BoxColor, Box>;

  constructor() {
    this.boxes = new Map<BoxColor, Box>();
  }

  public get(boxColor: BoxColor): Box {
    if(this.boxes.has(boxColor)) return this.boxes[boxColor];

    let box: Box;

    switch (boxColor) {
      case BoxColor.BLACK:
        box = new BlackBox(20, 20);
        break;

      case BoxColor.BLUE:
        box = new BlueBox(20, 20);
        break;

      default:
        throw new Error('Unsupported box color!');
    }

    this.boxes.set(boxColor, box);
    return box;
  }
}
