package Interpreter;

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class TeamLeadExpression implements IJobExpression {
    public void interpret(Context context) {
        if (context.formula.contains("L")) {
            context.totalPoint += 7000;
        }
    }
}
