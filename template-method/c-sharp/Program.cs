using System;

namespace TemplateMethod
{
    class Program
    {
        static void Main(string[] args)
        {
            DataAnalyzerBase dataAnalyzer;

            dataAnalyzer = new XmlDataAnalyzer();
            dataAnalyzer.AnalyzeDataOfLastWeek();
            // output:
            //  Method worked: GetDataOfLastWeek
            //  Method worked: AnalyzeData
            //  XML exported.

            dataAnalyzer = new HtmlDataAnalyzer();
            dataAnalyzer.AnalyzeDataOfLastWeek();

            // output:
            //  Method worked: GetDataOfLastWeek
            //  Method worked: AnalyzeData
            //  HTML exported.
        }
    }
}