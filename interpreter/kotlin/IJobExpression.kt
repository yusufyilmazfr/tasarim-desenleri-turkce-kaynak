package Interpreter

// Yorumlama işleminin tanımlandığı arayüz.
// UML diyagramındaki Expression arayüzüne denk gelmektedir.
internal interface IJobExpression {
    fun interpret(context: Context)
}