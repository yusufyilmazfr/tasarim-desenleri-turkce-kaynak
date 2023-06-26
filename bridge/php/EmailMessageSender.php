<?php

// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
class EmailMessageSender implements IMessageSender
{
    public function sendMessage(Message $message): void
    {
        echo "EmailMessageSender: Sending email message...";
    }
}
