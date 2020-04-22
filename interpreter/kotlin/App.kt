package Interpreter

fun main(args: Array<String>) {
    val context = Context()
    context.formula = "GGML"

    val jobManager = JobManager()
    jobManager.runExpression(context)

    println(context.formula + " :> " + context.totalPoint)
    // output: GGML :> 18000
}