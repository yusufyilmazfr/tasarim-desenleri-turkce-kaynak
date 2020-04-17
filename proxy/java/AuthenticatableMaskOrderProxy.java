package Proxy;

// İstemcinin muhatap olacağı sınıftır.
// Proxy sınıfımızdır.
// Gerçek işi yapan MaskOrder sınıfının referansını tutar.
// Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
class AuthenticatableMaskOrderProxy implements IOrderableMask {
    private IOrderableMask _orderMask;

    public AuthenticatableMaskOrderProxy() {
        _orderMask = new MaskOrder();
    }

    public void createOrder(Person person) {
        // Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
        Boolean isValid = checkPersonIsValid(person);

        if (isValid) {
            _orderMask.createOrder(person);
        }
    }

    private Boolean checkPersonIsValid(Person person) {
        // Burada Mernis servisleri ile iletişim sağlanabilir.
        // Örnek amaçlı TC numarasının 11 karakter olması yeterlidir.
        // Örnek amaçlı adres alanının boş olmaması yeterlidir.
        return person.tc.length() == 11 && person.address != "";
    }
}