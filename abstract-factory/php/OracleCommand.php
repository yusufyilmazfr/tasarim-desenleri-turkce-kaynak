<?php

namespace AbstractFactory;

use AbstractFactory\Command;

class OracleCommand extends Command
{
    public function executeCommand(string $query)
    {
        // Gelen sorgunun çalıştırılması için
        // Gerekli operasyonel işlemler...
    }
}
