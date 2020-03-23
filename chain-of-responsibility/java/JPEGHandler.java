package ChainOfResponsibility;

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPEGHandler extends BaseHandler {

    @Override
    public void handleRequest(Image image) {
        if (image.extension == "JPEG") {
            System.out.println("JPEG to PNG");
            // JPEG işlemine ait dönüştürme kodları işlemleri.
        } else {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            nextHandler.handleRequest(image);
        }
    }
}
