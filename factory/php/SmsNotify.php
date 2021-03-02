<?php

namespace Factory;

use Factory\INotify;
use Factory\User;

class SmsNotify implements INotify
{
    function sendNotification(User $user)
    {
        // SMS gönderme operasyonu.
    }
}
