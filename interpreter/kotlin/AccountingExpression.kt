package Interpreter

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
internal class AccountingExpression : IJobExpression {
    override fun interpret(context: Context) {
        if (context.formula!!.contains("M")) {
            context.totalPoint = context.totalPoint + 3000
        }
    }
}