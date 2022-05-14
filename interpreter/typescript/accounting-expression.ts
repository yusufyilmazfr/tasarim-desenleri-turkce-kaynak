import {IJobExpression} from "./job-expression.interface";
import {Context} from "./context";

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
export class AccountingExpression implements IJobExpression {
  public interpret(context: Context): void {
    if(context.formula.includes('M')) {
      context.totalPoint += 3000;
    }
  }
}
