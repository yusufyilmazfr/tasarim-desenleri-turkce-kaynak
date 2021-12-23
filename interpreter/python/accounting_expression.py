from context import Context
from job_expression import JobExpression


class AccountingExpression(JobExpression):
    def interpret(self, context: Context):
        if "m" in context.formula.lower():
            context.total_point += 3000
