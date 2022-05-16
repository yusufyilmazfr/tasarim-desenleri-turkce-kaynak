import {Context} from "./context";
import {JobManager} from "./job-manager";

function main() {
  const context = new Context();
  context.formula = 'GGML';

  const jobManager = new JobManager();
  jobManager.runExpression(context);

  console.log(`${context.formula} :> ${context.totalPoint}`);
  // output: GGML :> 18000
}
