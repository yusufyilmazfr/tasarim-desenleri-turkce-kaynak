package Interpreter;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        context.formula = "GGML";

        JobManager jobManager = new JobManager();
        jobManager.runExpression(context);

        System.out.println(context.formula + " :> " + context.totalPoint);
        // output: GGML :> 18000
    }
}
