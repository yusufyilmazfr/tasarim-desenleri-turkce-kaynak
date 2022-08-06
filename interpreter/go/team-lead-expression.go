package main

import "strings"

// Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
// UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
type teamLeadExpression struct{}

func NewTeamLeadExpression() *teamLeadExpression {
	return &teamLeadExpression{}
}

func (e *teamLeadExpression) Interpret(ctx *Context) {
	if strings.Contains(ctx.Formula, "L") {
		ctx.TotalPoint += 7000
	}
}
