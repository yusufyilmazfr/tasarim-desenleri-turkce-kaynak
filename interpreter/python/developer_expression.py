# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from context import Context
from job_expression import JobExpression


class DeveloperExpression(JobExpression):
    def interpret(self, context: Context):
        if "g" in context.formula.lower():
            context.total_point += 4000
