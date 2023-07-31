<?php

use AbstractFactory\CustomOperation;
use AbstractFactory\OracleDatabaseFactory;

$customOperation = new CustomOperation(new OracleDatabaseFactory());
$customOperation->removeById(1);
