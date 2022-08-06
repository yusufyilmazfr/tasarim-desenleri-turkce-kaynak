package main

import "fmt"

// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
type blackBox struct {
	width    int
	height   int
	boxColor int
}

func NewBlackBox(width, height int) *blackBox {
	return &blackBox{
		width:    width,
		height:   height,
		boxColor: BLACK,
	}
}

func (b blackBox) Draw(locationX, locationY int) {
	fmt.Printf("Black box drawn. %d,%d\n", locationX, locationY)
}
