package main

import "fmt"

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
type xmlDataAnalyzer struct {
	baseAnalyzer *DataAnalyzerBase
}

func NewXMLDataAnalyzer(b *DataAnalyzerBase) *xmlDataAnalyzer {
	return &xmlDataAnalyzer{
		baseAnalyzer: b,
	}
}

func (h xmlDataAnalyzer) exportResult(_ []byte) {
	// Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.e
	fmt.Println("XML exported.")
}
