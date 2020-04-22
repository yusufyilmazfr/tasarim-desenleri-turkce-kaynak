using System;
using System.Collections.Generic;
using System.Text;

namespace Interpreter
{
    class JobManager
    {
        public List<IJobExpression> CreateExpressionTree(string formula)
        {
            List<IJobExpression> tree = new List<IJobExpression>();

            foreach (char role in formula)
            {
                switch (role)
                {
                    case 'G':
                        tree.Add(new DeveloperExpression());
                        break;
                    case 'M':
                        tree.Add(new AccountingExpression());
                        break;
                    case 'L':
                        tree.Add(new TeamLeadExpression());
                        break;
                    default:
                        throw new Exception("Unexpected role!");
                }
            }
            return tree;
        }

        public void RunExpression(Context context)
        {
            foreach (IJobExpression expression in CreateExpressionTree(context.formula))
            {
                expression.Interpret(context);
            }
        }
    }
}
