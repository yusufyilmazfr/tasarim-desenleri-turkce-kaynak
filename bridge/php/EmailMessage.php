<?php

// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
class EmailMessage extends Message
{
    public function __construct(IMessageSender $messageSender)
    {
        parent::__construct($messageSender);
    }

    public function send(): void
    {
        $this->_messageSender->sendMessage($this);
    }
}
