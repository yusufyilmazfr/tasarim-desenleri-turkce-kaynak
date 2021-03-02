<?php

namespace Factory;

use Factory\INotify;
use Factory\User;

class MailNotify implements INotify
{
    function sendNotification(User $user)
    {
        // Mail gönderme operasyonu.
    }
}
