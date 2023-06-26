<?php

$textMessage = new TextMessage(new TextMessageSender());
$textMessage->send(); // output: TextMessageSender: Sending text message...

$emailMessage = new EmailMessage(new EmailMessageSender());
$emailMessage->send(); // output: EmailMessageSender: Sending email message...
