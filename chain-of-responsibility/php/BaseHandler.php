<?php

// Zincirin bir sonraki halkasının referansının tutulduğu sınıftır.
// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
abstract class BaseHandler
{
    protected BaseHandler $_nextHandler;

    public function setNextHandler(BaseHandler $nextHandler): void
    {
        $this->_nextHandler = $nextHandler;
    }

    public function handle(Image $image): void
    {
        $hasConverted = $this->handleRequest($image);

        if (!$hasConverted && !is_null($this->_nextHandler)) {
            $this->_nextHandler->handle($image);
        }
    }

    abstract public function handleRequest(Image $image): bool;
}
