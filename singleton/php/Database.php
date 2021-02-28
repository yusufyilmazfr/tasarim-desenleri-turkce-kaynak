<?php

class Database
{
    private static $database;

    private function __construct() {}

    public static  function  getInstance(): Database
    {
        if(self::$database == null)
        {
            self::$database = new Database();
        }

        return self::$database;
    }
}
