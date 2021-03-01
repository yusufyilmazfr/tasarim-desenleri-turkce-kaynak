<?php

namespace AbstractFactory;

// Soyut sınıfımızdır.
abstract class Connection
{
    public abstract function openConnection(): bool;
    public abstract function closeConnection(): bool;
}
