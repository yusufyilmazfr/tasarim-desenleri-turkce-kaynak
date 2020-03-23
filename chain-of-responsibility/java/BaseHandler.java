package ChainOfResponsibility;

// Zincirin bir sonraki halkasının tanımlandığı sınıftır.
// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
abstract class BaseHandler {
    protected BaseHandler nextHandler;

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Image image);
}
