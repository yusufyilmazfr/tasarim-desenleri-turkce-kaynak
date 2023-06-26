<?php

// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
class TextMessageSender implements IMessageSender
{
    public function sendMessage(Message $message): void
    {
        echo "TextMessageSender: Sending text message...";
    }
}
