<?php

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class CustomHandler extends BaseHandler
{
    public function handleRequest(Image $image): bool
    {
        if ($image->extension == "OtherExtension") {
            echo "OtherExtension to PNG";
            // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.

            return true;
        }

        return false;
    }
}
