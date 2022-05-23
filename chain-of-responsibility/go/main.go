package main

func main() {
	img := NewImage("tatil-fotografim", "JPG")

	handlerJPEG := NewJPEGHandler()
	handlerJPG := NewJPGHandler()
	handlerCustom := NewCustomHandler()

	handlerJPEG.SetNextHandler(handlerJPG)
	handlerJPG.SetNextHandler(handlerCustom)

	// Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
	// JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
	handlerJPEG.HandleRequest(*img)
}
