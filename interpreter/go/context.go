package main

// Context yorumlanacak olan içeriktir.
// UML diyagramındaki Context sınıfına denk gelir.
type Context struct {
	Formula    string
	TotalPoint int
}

func NewContext() *Context {
	return &Context{}
}
