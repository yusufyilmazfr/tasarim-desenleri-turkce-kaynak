using System;
using System.Collections.Generic;
using System.Text;

namespace Interpreter
{
    // Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
    // UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
    class DeveloperExpression : IJobExpression
    {
        public void Interpret(Context context)
        {
            if (context.formula.Contains('G'))
            {
                context.totalPoint += 4000;
            }
        }
    }
}
