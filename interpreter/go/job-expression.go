package main

// JobExpression yorumlama işleminin tanımlandığı arayüz.
// UML diyagramındaki Expression arayüzüne denk gelmektedir.
type JobExpression interface {
	Interpret(ctx *Context)
}
