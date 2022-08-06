package main

import "fmt"

// Metot iskeletimizi ve soyutlanmış metotları içermektedir.
// UML diyagramındaki AbstractClass yapısına denk gelmektedir.

type DataAnalyzer interface {
	exportResult([]byte)
}

type DataAnalyzerBase struct {
	dataAnalyzer DataAnalyzer
}

func NewDataAnalyzerBase() *DataAnalyzerBase {
	return &DataAnalyzerBase{}
}

func (d DataAnalyzerBase) AnalyzeDataOfLastWeek() {
	data := d.getDataOfLastWeek()
	result := d.analyzeData(data)
	d.dataAnalyzer.exportResult(result)
}

func (d DataAnalyzerBase) getDataOfLastWeek() []byte {
	// Burada veri verinin çağrılma süreçleri yer alacaktır.
	// Default olarak bir obje dönülmektedir.
	fmt.Println("Method worked: GetDataOfLastWeek")
	return []byte("data")
}

func (d DataAnalyzerBase) analyzeData(data []byte) []byte {
	// Burada verinin analizi süreci yer almaktadır.
	// Analiz sonuçları default olarak bir obje dönmektedir.
	fmt.Println("Method worked: AnalyzeData")
	return []byte("result")
}
