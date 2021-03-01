<?php

use Factory\NotifyFactory;
use Factory\User;

$notifyFactory = new NotifyFactory();

$notify = $notifyFactory->createNotify("MAIL");

$notify->sendNotification(new User());
