package main

import "fmt"

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
type htmlDataAnalyzer struct {
	baseAnalyzer *DataAnalyzerBase
}

func NewHTMLDataAnalyzer(b *DataAnalyzerBase) *htmlDataAnalyzer {
	return &htmlDataAnalyzer{
		baseAnalyzer: b,
	}
}

func (h htmlDataAnalyzer) exportResult(_ []byte) {
	// Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.e
	fmt.Println("HTML exported.")
}
