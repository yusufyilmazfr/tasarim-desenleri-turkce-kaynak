package main

// UML diyagramındaki Element'ten türer.
// Accept metoduna bulunduğu nesne örneği gönderilir.
// UML diyagramındaki ConcreteElement yapısına denk gelir.
type magazine struct {
	name         string
	author       string
	categoryName string
}

func NewMagazine(name, author, categoryName string) *magazine {
	return &magazine{
		name:         name,
		author:       author,
		categoryName: categoryName,
	}
}
func (m *magazine) Accept(visitor BookExportVisitor) {
	visitor.exportVisit(m)
}

func (m magazine) GetName() string {
	return m.name
}
