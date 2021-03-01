<?php

namespace AbstractFactory;

// Soyut sınıfımızdır.
abstract class Command
{
    public abstract function executeCommand(string $query);
}
