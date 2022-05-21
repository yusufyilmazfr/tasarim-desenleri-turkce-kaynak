package main

func main() {
	dataSource := NewFileDataSource("data.sql")

	compressedDataSource := NewCompressionDecorator(dataSource)

	compressedDataSource.ReadData()
	compressedDataSource.WriteData([]byte("data"))
}
