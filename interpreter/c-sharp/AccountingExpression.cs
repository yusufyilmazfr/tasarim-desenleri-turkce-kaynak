using System;
using System.Collections.Generic;
using System.Text;

namespace Interpreter
{
    // Dil bilgisindeki terminal ifadeler üzerinde işlem yapar.
    // UML diyagramındaki TerminalExpression sınıfına denk gelmektedir.
    class AccountingExpression : IJobExpression
    {
        public void Interpret(Context context)
        {
            if (context.formula.Contains('M'))
            {
                context.totalPoint += 3000;
            }
        }
    }
}
