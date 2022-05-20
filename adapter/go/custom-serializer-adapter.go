package main

// customSerializerAdapter Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede JSONSerializer'i uygulayan bir struct örneği istendiğinde
// bu struct örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlanır.
// UML diyagramındaki Adapter'a denk gelmektedir.
type customSerializerAdapter struct{}

func NewCustomSerializerAdapter() *customSerializerAdapter {
	return &customSerializerAdapter{}
}

func (c *customSerializerAdapter) serializeObject(object []byte) string {
	customSerializer := NewCustomSerializer()
	return customSerializer.Serialize(object)
}
