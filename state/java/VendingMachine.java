package State;

// Durumu izlenecek olan sınıftır.
// UML diyagramındaki Context yapısına denk gelmektedir.
public class VendingMachine {
    private VendingMachineState _state;

    // Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
    public VendingMachine() {
        setState(new InitializeState());
    }

    public void setState(VendingMachineState state) {
        _state = state;
        _state.handleState(this);
    }

    public void requestProduct(String productName, double price) {
        // Burada ürünlere ait iş kodları olacaktır.
        // Ürün kontrolü, fiyatlandırma gibi kontroller.
        // Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.

        setState(new PreparingState());
    }
}