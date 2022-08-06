package main

// customSerializer sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
type customSerializer struct{}

func NewCustomSerializer() *customSerializer {
	return &customSerializer{}
}

// Serialize Gelen nesneyi serilize etmek için temel operasyonel işlemler yapar.
// Daha sonradan da gerekli değerin geri döndürür.
func (c *customSerializer) Serialize(object []byte) string {
	return "serialized with customSerializer"
}
