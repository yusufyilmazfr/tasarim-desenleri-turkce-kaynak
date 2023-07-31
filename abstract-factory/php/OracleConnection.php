<?php

namespace AbstractFactory;

use AbstractFactory\Connection;

class OracleConnection extends Connection
{
    public function openConnection(): bool
    {
        // Oracle veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...
        return true;
    }

    public function closeConnection(): bool
    {
        // Oracle veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
}
