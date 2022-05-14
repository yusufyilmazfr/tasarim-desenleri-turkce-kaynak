import {Context} from "./context";

// Yorumlama işleminin tanımlandığı arayüz.
// UML diyagramındaki Expression arayüzüne denk gelmektedir.
export interface IJobExpression {
  interpret(context: Context): void;
}
