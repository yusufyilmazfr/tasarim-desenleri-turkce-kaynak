<?php

namespace adapter\php;

// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
interface IJsonSerializer
{
    public function serializeObject(object $obj): string;
}
