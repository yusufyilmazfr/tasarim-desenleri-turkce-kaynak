package Adapter;

public class CustomOperation {
    private IJsonSerializer _jsonSerializer;

    public CustomOperation(IJsonSerializer jsonSerializer) {
        _jsonSerializer = jsonSerializer;
    }

    public String SerializeObject(Object obj) {
        return _jsonSerializer.serializeObject(obj);
    }
}
