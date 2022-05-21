package main

import "fmt"

// fileDataSource UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
type fileDataSource struct {
	fileName string
}

func NewFileDataSource(fileName string) *fileDataSource {
	return &fileDataSource{fileName}
}

func (ds fileDataSource) GetFileName() string {
	return ds.fileName
}

func (ds fileDataSource) ReadData() {
	fmt.Println(ds.fileName + " read.")
}

func (ds fileDataSource) WriteData(data []byte) {
	fmt.Println("data was written to " + ds.fileName)
}
