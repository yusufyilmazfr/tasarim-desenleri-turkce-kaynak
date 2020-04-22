package Command

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
internal class BuyStock(private val _stockManager: StockManager) : IOrderCommand {

    override fun execute() {
        _stockManager.buy()
    }
}