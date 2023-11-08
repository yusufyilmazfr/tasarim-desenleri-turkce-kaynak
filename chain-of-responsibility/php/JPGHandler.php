<?php

// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPGHandler extends BaseHandler
{
    public function handleRequest(Image $image): bool
    {
        if ($image->extension == "JPG") {
            echo "JPG to PNG";
            // JPG işlemine ait dönüştürme kodları işlemleri.

            return true;
        }

        return false;
    }
}
