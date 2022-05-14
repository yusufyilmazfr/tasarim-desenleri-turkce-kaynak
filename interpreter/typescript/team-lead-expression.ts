import {IJobExpression} from "./job-expression.interface";
import {Context} from "./context";

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
export class TeamLeadExpression implements IJobExpression {
  public interpret(context: Context): void {
    if(context.formula.includes('L')) {
      context.totalPoint += 7000;
    }
  }
}
