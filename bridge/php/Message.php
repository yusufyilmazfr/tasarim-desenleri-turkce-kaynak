<?php

// UML diyagramındaki Abstraction kısmına denk gelmektedir.
// Implementor (IMessageSender) arayüzünün referansını tutmaktadır.
abstract class Message
{
    protected IMessageSender $_messageSender;

    public function __construct(IMessageSender $messageSender)
    {
        $this->_messageSender = $messageSender;
    }

    abstract public function send(): void;
}
