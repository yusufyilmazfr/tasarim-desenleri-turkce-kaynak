package TemplateMethod

fun main(args: Array<String>) {
    var dataAnalyzer: DataAnalyzerBase

    dataAnalyzer = XmlDataAnalyzer()
    dataAnalyzer.analyzeDataOfLastWeek()
    // output:
    //  Method worked: GetDataOfLastWeek
    //  Method worked: AnalyzeData
    //  XML exported.

    dataAnalyzer = HtmlDataAnalyzer()
    dataAnalyzer.analyzeDataOfLastWeek()
    // output:
    //  Method worked: GetDataOfLastWeek
    //  Method worked: AnalyzeData
    //  HTML exported.
}
