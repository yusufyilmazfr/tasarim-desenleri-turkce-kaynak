from context import Context
from job_expression import JobExpression


class TeamLeadExpression(JobExpression):
    def interpret(self, context: Context):
        if 'l' in context.formula.lower():
            context.total_point += 7000
