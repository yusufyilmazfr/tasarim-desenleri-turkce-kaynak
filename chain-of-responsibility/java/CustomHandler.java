package ChainOfResponsibility;

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class CustomHandler extends BaseHandler {
    @Override
    public void handleRequest(Image image) {
        if (image.extension == "OtherExtension") {
            System.out.println("OtherExtension to PNG");
            // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
        }
        // Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
    }
}