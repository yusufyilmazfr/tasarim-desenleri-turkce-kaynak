package Observer;

import java.util.ArrayList;
import java.util.List;

// Takip edilecek olan yapımızdır.
// İçerisinde Observer (değişimden etkilenecek) nesneleri tutar.
// UML diyagramındaki Observable yapısına denk gelmektedir.
abstract class ObservableProduct {
    private List<IObserverUser> _users;
    protected ProductUpdateMessage message;

    public ObservableProduct() {
        _users = new ArrayList<IObserverUser>();
        message = new ProductUpdateMessage();
    }

    public void addObserver(IObserverUser observerUser) {
        _users.add(observerUser);
    }

    public void removeObserver(IObserverUser observerUser) {
        _users.remove(observerUser);
    }

    public void notifyObserver() {
        for (IObserverUser user : _users) {
            user.sendNotification(message);
        }
    }
}