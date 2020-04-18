package State

// Durumu izlenecek olan sınıftır.
// UML diyagramındaki Context yapısına denk gelmektedir.
class VendingMachine {
    private var _state: VendingMachineState? = null

    // Otomata örneği oluştuğu zaman başlangıç durumuna geçiyor.
    init {
        setState(InitializeState())
    }

    fun setState(state: VendingMachineState) {
        _state = state
        _state!!.handleState(this)
    }

    fun requestProduct(productName: String, price: Double) {
        // Burada ürünlere ait iş kodları olacaktır.
        // Ürün kontrolü, fiyatlandırma gibi kontroller.
        // Ürün ve fiyat olarak bir problemin olmadığı var sayılsın.

        setState(PreparingState())
    }
}