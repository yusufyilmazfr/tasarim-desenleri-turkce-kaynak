import {Context} from "./context";
import {IJobExpression} from "./job-expression.interface";
import {DeveloperExpression} from "./developer-expression";
import {AccountingExpression} from "./accounting-expression";
import {TeamLeadExpression} from "./team-lead-expression";

export class JobManager {
  public createExpressionTree(formula: string): IJobExpression[] {
    const tree: IJobExpression[] = [];

    for(const role of formula) {
      switch (role) {
        case 'G':
          tree.push(new DeveloperExpression())
          break;
        case 'M':
          tree.push(new AccountingExpression())
          break;
        case 'L':
          tree.push(new TeamLeadExpression())
          break;
        default:
          throw new Error('Unexpected role!');
      }
    }

    return tree;
  }

  public runExpression(context: Context): void {
    for (let expression of this.createExpressionTree(context.formula)) {
      expression.interpret(context);
    }
  }
}
