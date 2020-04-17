package Proxy

// İstemcinin muhatap olacağı sınıftır.
// Proxy sınıfımızdır.
// Gerçek işi yapan MaskOrder sınıfının referansını tutar.
// Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
internal class AuthenticatableMaskOrderProxy : IOrderableMask {
    private val _orderMask: IOrderableMask

    init {
        _orderMask = MaskOrder()
    }

    override fun createOrder(person: Person) {
        // Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
        val isValid = checkPersonIsValid(person)

        if (isValid) {
            _orderMask.createOrder(person)
        }
    }

    private fun checkPersonIsValid(person: Person): Boolean {
        // Burada Mernis servisleri ile iletişim sağlanabilir.
        // Örnek amaçlı TC numarasının 11 karakter olması yeterlidir.
        // Örnek amaçlı adres alanının boş olmaması yeterlidir.
        return person.tc.length == 11 && person.address !== ""
    }
}