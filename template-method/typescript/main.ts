import {DataAnalyzerBase} from "./data-analyzer-base";
import {XmlDataAnalyzer} from "./xml-data-analyzer";
import {HtmlDataAnalyzer} from "./html-data-analyzer";

function main() {
  let dataAnalyzer: DataAnalyzerBase;

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
