using System;
using System.Collections.Generic;
using System.Text;

namespace Factory
{
    class NotifyFactory
    {
        public INotify CreateNotify(string notifyType)
        {
            if (notifyType == "SMS")
            {
                // Buradaki nesne oluşturma süreçleri bize kalmıştır.
                // Kullanıcıdan soyutlanmıştır.
                // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
                return new SmsNotify();
            }
            else if (notifyType == "MAIL")
            {
                // Buradaki nesne oluşturma süreçleri bize kalmıştır.
                // Kullanıcıdan soyutlanmıştır.
                // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
                return new MailNotify();
            }
            return null;
        }
    }
}
