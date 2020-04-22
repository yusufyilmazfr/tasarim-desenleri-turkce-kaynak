package Interpreter;

import java.util.ArrayList;
import java.util.List;

class JobManager {
    public List<IJobExpression> createExpressionTree(String formula) {
        List<IJobExpression> tree = new ArrayList<>();

        for (char role : formula.toCharArray()) {
            switch (role) {
                case 'G':
                    tree.add(new DeveloperExpression());
                    break;
                case 'M':
                    tree.add(new AccountingExpression());
                    break;
                case 'L':
                    tree.add(new TeamLeadExpression());
                    break;
                default:
                    new Exception("Unexpected role!");
            }
        }
        return tree;
    }

    public void runExpression(Context context) {
        for (IJobExpression expression : createExpressionTree(context.formula)) {
            expression.interpret(context);
        }
    }
}