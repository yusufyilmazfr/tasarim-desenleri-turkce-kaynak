package Command;

// Nesnelere dönüştürdüğümüz her bir isteğe denk gelmektedir.
// Command (IOrderCommand) arayüzünü uygular.
// UML diyagramındaki ConcreteCommand sınıfına denk gelmektedir.
class SellStock implements IOrderCommand {
    private StockManager _stockManager;

    public SellStock(StockManager stockManager) {
        _stockManager = stockManager;
    }

    public void execute() {
        _stockManager.sell();
    }
}