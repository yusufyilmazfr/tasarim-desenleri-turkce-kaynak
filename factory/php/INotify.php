<?php

namespace Factory;

use Factory\User;

interface INotify
{
    function sendNotification(User $user);
}
