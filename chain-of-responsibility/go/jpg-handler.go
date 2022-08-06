package main

import "fmt"

// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
type jpgHandler struct {
	nextHandler BaseHandler
}

func NewJPGHandler() *jpgHandler {
	return &jpgHandler{}
}

func (h *jpgHandler) SetNextHandler(handler BaseHandler) {
	h.nextHandler = handler
}

func (h jpgHandler) HandleRequest(img Image) {
	if img.Extension == "JPG" {
		fmt.Println("JPG to PNG")
		// JPG işlemine ait dönüştürme kodları işlemleri.
	} else {
		// Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
		h.nextHandler.HandleRequest(img)
	}
}
