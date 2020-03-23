package ChainOfResponsibility

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
internal class CustomHandler : BaseHandler() {
    override fun handleRequest(image: Image) {
        if (image.extension === "OtherExtension") {
            println("OtherExtension to PNG")
            // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
        }
        // Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
    }
}