package main

import "strings"

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
type developerExpression struct{}

func NewDeveloperExpression() *developerExpression {
	return &developerExpression{}
}

func (e *developerExpression) Interpret(ctx *Context) {
	if strings.Contains(ctx.Formula, "G") {
		ctx.TotalPoint += 4000
	}
}
