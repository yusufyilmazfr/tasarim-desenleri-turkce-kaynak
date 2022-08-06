package main

import "fmt"

func main() {
	customOperation := NewCustomOperation(NewCustomSerializerAdapter())
	serializedObject := customOperation.SerializeObject([]byte("test"))

	fmt.Println(serializedObject)
}
