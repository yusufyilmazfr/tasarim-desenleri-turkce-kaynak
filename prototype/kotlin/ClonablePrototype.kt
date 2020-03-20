package Prototype

// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
// Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
// Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
// Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
abstract class CloneablePrototype<TPrototype> : Cloneable {
    public fun cloneObject(): TPrototype {
        return super.clone() as TPrototype;
    }
}