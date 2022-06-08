package main

// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
type encyclopedia struct {
	name         string
	author       string
	categoryName string
}

func NewEncyclopedia(name, author, categoryName string) *encyclopedia {
	return &encyclopedia{
		name:         name,
		author:       author,
		categoryName: categoryName,
	}
}
func (e *encyclopedia) Accept(visitor BookExportVisitor) {
	visitor.exportVisit(e)
}
func (e encyclopedia) GetName() string {
	return e.name
}
