package main

import "fmt"

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
type customHandler struct {
	nextHandler BaseHandler
}

func NewCustomHandler() *customHandler {
	return &customHandler{}
}

func (h *customHandler) SetNextHandler(nextHandler BaseHandler) {
	h.nextHandler = nextHandler
}

func (h customHandler) HandleRequest(img Image) {
	if img.Extension == "OtherExtension" {
		fmt.Println("OtherExtension to PNG")
		// Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
	}
	// Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
}
