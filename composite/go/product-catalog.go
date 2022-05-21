package main

import "fmt"

// Somut yapımızdır.
// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (ICatalogComponent) listesi tutmaktadır.
type productCatalog struct {
	name       string
	components []CatalogComponent
}

func NewProductCatalog(name string) *productCatalog {
	return &productCatalog{
		name:       name,
		components: make([]CatalogComponent, 0),
	}
}

func (c *productCatalog) Add(component CatalogComponent) {
	c.components = append(c.components, component)
}

func (c *productCatalog) Remove(component CatalogComponent) {
	for i, v := range c.components {
		if v == component {
			c.components = append(c.components[:i], c.components[i+1:]...)
			break
		}
	}
}

func (c productCatalog) DrawHierarchy() {
	fmt.Println(c.name)
	for _, component := range c.components {
		component.DrawHierarchy()
	}
}
