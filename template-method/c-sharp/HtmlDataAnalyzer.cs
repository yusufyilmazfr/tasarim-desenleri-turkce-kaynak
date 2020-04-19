using System;
using System.Collections.Generic;
using System.Text;

namespace TemplateMethod
{
    // UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
    // UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
    class HtmlDataAnalyzer : DataAnalyzerBase
    {
        public override void ExportResult(object result)
        {
            // Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
            Console.WriteLine("HTML exported.");
        }
    }
}
