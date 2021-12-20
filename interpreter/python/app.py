# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 20.12.2021
from context import Context
from job_manager import JobManager

if __name__ == '__main__':
    context = Context()
    context.formula = "GGML"

    job_manager = JobManager()
    job_manager.run_expression(context)
    print(f"{context.formula} :> {context.total_point} ")
    # output: GGML :> 18000
