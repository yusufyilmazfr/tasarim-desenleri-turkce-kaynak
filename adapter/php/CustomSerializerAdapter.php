<?php

namespace adapter\php;

// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlaır.
// UML diyagramındaki Adapter'a denk gelmektedir.
class CustomSerializerAdapter implements IJsonSerializer
{
    public function serializeObject(object $obj): string
    {
        $customSerializer = new CustomSerializer();

        return $customSerializer->serialize($obj);
    }
}
