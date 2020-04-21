package Observer

import java.util.ArrayList

// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
// UML diyagramındaki Observable yapısına denk gelmektedir.
internal abstract class ObservableProduct {
    private val _users: MutableList<IObserverUser>
    protected var message: ProductUpdateMessage

    init {
        _users = ArrayList()
        message = ProductUpdateMessage()
    }

    fun addObserver(observerUser: IObserverUser) {
        _users.add(observerUser)
    }

    fun removeObserver(observerUser: IObserverUser) {
        _users.remove(observerUser)
    }

    fun notifyObserver() {
        for (user in _users) {
            user.sendNotification(message)
        }
    }
}