using System;
using System.Collections.Generic;
using System.Text;

namespace Prototype
{
    // Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
    // Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
    // Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
    // Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
    interface IClonablePrototype<TPrototype>
    {
        TPrototype Clone();
    }
}
