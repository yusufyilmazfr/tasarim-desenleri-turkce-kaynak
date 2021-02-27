<?php

$firstInstanceRequest = Database::getInstance();
$secondInstanceRequest = Database::getInstance();

$isEquals = $firstInstanceRequest == $secondInstanceRequest;

echo "Database referance is equals: $isEquals"; //output: Database referance is equals: 1
