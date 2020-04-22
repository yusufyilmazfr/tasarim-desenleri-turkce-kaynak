using System;
using System.Collections.Generic;
using System.Text;

namespace Interpreter
{
    // Yorumlama işleminin tanımlandığı arayüz.
    // UML diyagramındaki Expression arayüzüne denk gelmektedir.
    interface IJobExpression
    {
        void Interpret(Context context);
    }
}
