<?php

use adapter\php\CustomOperation;
use adapter\php\CustomSerializerAdapter;

$customOperation = new CustomOperation(new CustomSerializerAdapter());

$serializedObject = $customOperation->serializeObject(new stdClass());

echo $serializedObject; // output: serialized with CustomSerializer
