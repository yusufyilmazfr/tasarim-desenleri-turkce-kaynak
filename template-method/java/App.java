package TemplateMethod;

public class App {
    public static void main(String[] args) {
        DataAnalyzerBase dataAnalyzer;

        dataAnalyzer = new XmlDataAnalyzer();
        dataAnalyzer.analyzeDataOfLastWeek();
        // output:
        //  Method worked: GetDataOfLastWeek
        //  Method worked: AnalyzeData
        //  XML exported.

        dataAnalyzer = new HtmlDataAnalyzer();
        dataAnalyzer.analyzeDataOfLastWeek();

        // output:
        //  Method worked: GetDataOfLastWeek
        //  Method worked: AnalyzeData
        //  HTML exported.
    }
}
