import {BoxFactory} from "./box-factory";
import {BoxColor} from "./box-color";

function main() {
  const boxFactory = new BoxFactory();

  const blackBox1 = boxFactory.get(BoxColor.BLACK);
  const blackBox2 = boxFactory.get(BoxColor.BLACK);
  const blackBox3 = boxFactory.get(BoxColor.BLACK);
  const blueBox = boxFactory.get(BoxColor.BLUE);

  blackBox1.draw(53, 34);
  blackBox2.draw(63, 24);
  blackBox3.draw(159, 60);
  blueBox.draw(99, 11);
  // output:
  //  Black box drawn. 97,37
  //  Black box drawn. 34,78
  //  Black box drawn. 74,193
  //  Blue box drawn. 1,4
}
