import {IJobExpression} from "./job-expression.interface";
import {Context} from "./context";

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
export class DeveloperExpression implements IJobExpression {
  public interpret(context: Context): void {
    if(context.formula.includes('G')) {
      context.totalPoint += 4000;
    }
  }
}
