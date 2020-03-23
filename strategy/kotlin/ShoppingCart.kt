package Strategy

import java.util.ArrayList

// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
internal class ShoppingCart {
    private val items: MutableList<Item>
    private var payment: IPayment? = null

    init {
        items = ArrayList()
    }

    fun setPaymentMethod(payment: IPayment) {
        this.payment = payment
    }

    fun addItem(item: Item) {
        this.items.add(item)
    }

    fun calculateTotal(): Int {
        var sum = 0
        for (item in this.items) {
            sum += item.price
        }
        return sum
    }

    fun Pay() {
        val amount = calculateTotal()
        this.payment!!.pay(amount)
    }
}