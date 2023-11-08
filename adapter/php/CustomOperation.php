<?php

namespace adapter\php;

class CustomOperation
{
    private IJsonSerializer $_jsonSerializer;

    public function __construct(IJsonSerializer $jsonSerializer)
    {
        $this->_jsonSerializer = $jsonSerializer;
    }

    public function serializeObject(object $obj): string
    {
        return $this->_jsonSerializer->serializeObject($obj);
    }
}
