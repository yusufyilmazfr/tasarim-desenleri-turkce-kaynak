using System;
using System.Collections.Generic;
using System.Text;

namespace TemplateMethod
{
    // Metot iskeletimizi ve soyutlanmış metotları içermektedir.
    // UML diyagramındaki AbstractClass yapısına denk gelmektedir.
    abstract class DataAnalyzerBase
    {
        // Metot iskeletimiz.
        public void AnalyzeDataOfLastWeek()
        {
            object data = GetDataOfLastWeek();
            object result = AnalyzeData(data);
            ExportResult(result);
        }

        private object GetDataOfLastWeek()
        {
            // Burada veri verinin çağrılma süreçleri yer alacaktır.
            // Default olarak bir obje dönülmektedir.
            Console.WriteLine("Method worked: GetDataOfLastWeek");
            return new object();
        }

        private object AnalyzeData(object data)
        {
            // Burada verinin analizi süreci yer almaktadır.
            // Analiz sonuçları default olarak bir obje dönmektedir.
            Console.WriteLine("Method worked: AnalyzeData");
            return new object();
        }

        // Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
        // Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
        public abstract void ExportResult(object result);
    }
}
