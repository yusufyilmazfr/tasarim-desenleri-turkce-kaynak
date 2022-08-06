package main

import "strings"

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
type accountingExpression struct{}

func NewAccountingExpression() *accountingExpression {
	return &accountingExpression{}
}

func (e accountingExpression) Interpret(ctx *Context) {
	if strings.Contains(ctx.Formula, "M") {
		ctx.TotalPoint += 3000
	}
}
