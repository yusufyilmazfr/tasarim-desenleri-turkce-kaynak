using System;
using System.Collections.Generic;
using System.Text;

namespace Proxy
{
    // İstemcinin muhatap olacağı sınıftır.
    // Proxy sınıfımızdır.
    // Gerçek işi yapan MaskOrder sınıfının referansını tutar.
    // Sipariş verilmeden önce vatandaşın bilgilerinin kontrolü yapılır.
    class AuthenticatableMaskOrderProxy : IOrderableMask
    {
        private IOrderableMask _orderMask;

        public AuthenticatableMaskOrderProxy()
        {
            _orderMask = new MaskOrder();
        }

        public void CreateOrder(Person person)
        {
            // Sipariş oluşturulmadan önce kimlik kontrolü yapılıyor.
            bool isValid = CheckPersonIsValid(person);

            if (isValid)
            {
                _orderMask.CreateOrder(person);
            }
        }

        private bool CheckPersonIsValid(Person person)
        {
            // Burada Mernis servisleri ile iletişim sağlanabilir.
            // Örnek amaçlı TC numarasının 11 karakter olması yeterlidir. 
            // Örnek amaçlı adres alanının boş olmaması yeterlidir. 
            return person.TC.Length == 11 && person.Address != "";
        }
    }
}
