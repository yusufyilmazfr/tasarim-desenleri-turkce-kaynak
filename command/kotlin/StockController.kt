package Command

import java.util.ArrayList

// Command (IOrderCommand) arayüzünü uygulayan sınıf referansını tutar.
// Metotun ne zaman çağrılacağını belirtir.
// UML diyagramındaki Invoker sınıfına denk gelmektedir.
internal class StockController {
    private val _orderCommands: MutableList<IOrderCommand>

    init {
        _orderCommands = ArrayList()
    }

    fun takeOrder(command: IOrderCommand) {
        _orderCommands.add(command)
    }

    fun placeOrders() {
        for (command in _orderCommands) {
            command.execute()
        }

        _orderCommands.clear()
    }
}
