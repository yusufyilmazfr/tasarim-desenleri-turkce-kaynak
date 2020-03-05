using System;
using System.Collections.Generic;
using System.Text;

namespace Factory
{
    public class SmsNotify : INotify
    {
        public void SendNotification(User user)
        {
            // SMS gönderme operasyonu.
        }
    }
}
