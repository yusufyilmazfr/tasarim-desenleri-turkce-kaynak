package Interpreter

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
internal class TeamLeadExpression : IJobExpression {
    override fun interpret(context: Context) {
        if (context.formula!!.contains("L")) {
            context.totalPoint = context.totalPoint + 7000
        }
    }
}
