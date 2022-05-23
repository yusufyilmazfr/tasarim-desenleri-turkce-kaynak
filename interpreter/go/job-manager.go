package main

import "errors"

type JobManager struct {
}

func NewJobManager() *JobManager {
	return &JobManager{}
}

func (jm JobManager) createExpressionTree(formula string) ([]JobExpression, error) {
	tree := make([]JobExpression, 0)

	for _, role := range formula {
		switch role {
		case 'G':
			tree = append(tree, NewDeveloperExpression())
		case 'M':
			tree = append(tree, NewAccountingExpression())
		case 'L':
			tree = append(tree, NewTeamLeadExpression())
		default:
			return nil, errors.New("Unexpected role " + string(role))
		}
	}

	return tree, nil
}

func (jm JobManager) RunExpression(ctx *Context) error {
	tree, err := jm.createExpressionTree(ctx.Formula)
	if err != nil {
		return err
	}
	for _, expression := range tree {
		expression.Interpret(ctx)
	}
	return nil
}
