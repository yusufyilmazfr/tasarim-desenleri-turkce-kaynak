using System;
using System.Collections.Generic;
using System.Text;

namespace Factory
{
    class MailNotify : INotify
    {
        public void SendNotification(User user)
        {
            // Mail gönderme operasyonu.
        }
    }
}
