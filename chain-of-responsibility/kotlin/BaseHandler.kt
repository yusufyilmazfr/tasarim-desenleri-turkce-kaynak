package ChainOfResponsibility

// Zincirin bir sonraki halkasının tanımlandığı sınıftır.
// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
public abstract class BaseHandler {
    private var nextHandler: BaseHandler? = null

    fun setNextHandler(nextHandler: BaseHandler) {
        this.nextHandler = nextHandler
    }

    fun getNextHandler(): BaseHandler? {
        return this.nextHandler
    }

    abstract fun handleRequest(image: Image)
}
