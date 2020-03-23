package ChainOfResponsibility

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
internal class JPEGHandler : BaseHandler() {

    override fun handleRequest(image: Image) {
        if (image.extension === "JPEG") {
            println("JPEG to PNG")
            // JPEG işlemine ait dönüştürme kodları işlemleri.
        } else {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            getNextHandler()?.handleRequest(image)
        }
    }
}
