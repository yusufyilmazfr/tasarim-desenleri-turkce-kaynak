<?php

namespace AbstractFactory;

use AbstractFactory\Connection;
use AbstractFactory\Command;

// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
interface IDatabaseFactory
{
    function createConnection(): Connection;
    function createCommand(): Command;
}
