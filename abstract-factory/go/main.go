package main

func main() {
	CustomOperation := NewCustomOperation(NewOracleDatabaseFactory())
	if err := CustomOperation.removeById(1); err != nil {
		panic(err)
	}
}
