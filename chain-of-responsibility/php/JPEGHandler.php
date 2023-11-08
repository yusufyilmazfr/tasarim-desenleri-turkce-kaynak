<?php

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPEGHandler extends BaseHandler
{
    public function handleRequest(Image $image): bool
    {
        if ($image->extension == "JPEG") {
            echo "JPEG to PNG";
            // JPEG işlemine ait dönüştürme kodları işlemleri.

            return true;
        }

        return false;
    }
}
