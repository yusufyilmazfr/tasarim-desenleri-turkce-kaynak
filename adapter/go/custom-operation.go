package main

type customOperation struct {
	jsonSerializer JSONSerializer
}

func NewCustomOperation(jsonSerializer JSONSerializer) *customOperation {
	return &customOperation{
		jsonSerializer: jsonSerializer,
	}
}

func (c *customOperation) SerializeObject(object []byte) string {
	return c.jsonSerializer.serializeObject(object)
}
