<?php

// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image
{
    public string $name;
    public string $extension;

    public function __construct(string $name, string $extension)
    {
        $this->name = $name;
        $this->extension = $extension;
    }

}
