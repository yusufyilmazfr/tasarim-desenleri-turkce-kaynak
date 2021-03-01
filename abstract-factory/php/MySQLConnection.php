<?php

namespace AbstractFactory;

use AbstractFactory\Connection;

class MySQLConnection extends Connection
{
    public function openConnection(): bool
    {
        // MySQL veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...
        return true;
    }

    public function closeConnection(): bool
    {
        // MySQL veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
}
