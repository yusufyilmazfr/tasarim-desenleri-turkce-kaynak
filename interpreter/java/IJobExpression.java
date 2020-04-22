package Interpreter;

// Yorumlama işleminin tanımlandığı arayüz.
// UML diyagramındaki Expression arayüzüne denk gelmektedir.
interface IJobExpression {
    void interpret(Context context);
}