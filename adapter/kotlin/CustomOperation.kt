package Adapter

class CustomOperation {
    private val _jsonSerializer: IJsonSerializer

    constructor(jsonSerializer: IJsonSerializer) {
        _jsonSerializer = jsonSerializer
    }

    fun SerializeObject(obj: Any): String {
        return _jsonSerializer.serializeObject(obj)
    }
}
