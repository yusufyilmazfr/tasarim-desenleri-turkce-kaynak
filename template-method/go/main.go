package main

import "fmt"

func main() {
	analyzer := NewDataAnalyzerBase()

	analyzer.dataAnalyzer = NewXMLDataAnalyzer(analyzer)
	analyzer.AnalyzeDataOfLastWeek()
	// output:
	//  Method worked: GetDataOfLastWeek
	//  Method worked: AnalyzeData
	//  XML exported.

	fmt.Println()

	analyzer.dataAnalyzer = NewHTMLDataAnalyzer(analyzer)
	analyzer.AnalyzeDataOfLastWeek()
	// output:
	//  Method worked: GetDataOfLastWeek
	//  Method worked: AnalyzeData
	//  HTML exported.
}
