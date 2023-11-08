<?php

namespace adapter\php;

// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
// UML diyagramındaki Adaptee'ye denk gelmektedir.
class CustomSerializer
{
    public function serialize(object $obj): string
    {
        // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        // Daha sonradan da gerekli değerin geri döndürülmesi...
        return "serialized with CustomSerializer";
    }
}
