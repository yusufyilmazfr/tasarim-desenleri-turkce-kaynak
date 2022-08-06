package main

import "fmt"

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
type jpegHandler struct {
	nextHandler BaseHandler
}

func NewJPEGHandler() *jpegHandler {
	return &jpegHandler{}
}

func (h *jpegHandler) SetNextHandler(nextHandler BaseHandler) {
	h.nextHandler = nextHandler
}

func (h jpegHandler) HandleRequest(img Image) {
	if img.Extension == "JPEG" {
		fmt.Printf("JPEG to PNG")
		// JPEG işlemine ait dönüştürme kodları işlemleri.
	} else {
		// Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
		h.nextHandler.HandleRequest(img)
	}
}
