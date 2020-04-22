package Interpreter;

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
class AccountingExpression implements IJobExpression {
    public void interpret(Context context) {
        if (context.formula.contains("M")) {
            context.totalPoint += 3000;
        }
    }
}