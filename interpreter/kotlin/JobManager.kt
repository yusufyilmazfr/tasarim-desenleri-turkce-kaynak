package Interpreter

import java.util.ArrayList

internal class JobManager {
    fun createExpressionTree(formula: String): List<IJobExpression> {
        val tree = ArrayList<IJobExpression>()

        for (role in formula.toCharArray()) {
            when (role) {
                'G' -> tree.add(DeveloperExpression())
                'M' -> tree.add(AccountingExpression())
                'L' -> tree.add(TeamLeadExpression())
                else -> Exception("Unexpected role!")
            }
        }
        return tree
    }

    fun runExpression(context: Context) {
        for (expression in createExpressionTree(context.formula!!)) {
            expression.interpret(context)
        }
    }
}