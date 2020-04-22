package Interpreter

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
internal class DeveloperExpression : IJobExpression {
    override fun interpret(context: Context) {
        if (context.formula!!.contains("G")) {
            context.totalPoint = context.totalPoint + 4000
        }
    }
}