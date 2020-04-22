package Interpreter;

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class DeveloperExpression implements IJobExpression {
    public void interpret(Context context) {
        if (context.formula.contains("G")) {
            context.totalPoint += 4000;
        }
    }
}