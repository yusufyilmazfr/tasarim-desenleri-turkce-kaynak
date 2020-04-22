using System;
using System.Collections.Generic;

namespace Interpreter
{
    class Program
    {

        static void Main(string[] args)
        {
            Context context = new Context();
            context.formula = "GGML";

            JobManager jobManager = new JobManager();
            jobManager.RunExpression(context);

            Console.WriteLine($"{context.formula} :> {context.totalPoint}");
            // output: GGML :> 18000
        }
    }
}
