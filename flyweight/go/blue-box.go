package main

import "fmt"

// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
type blueBox struct {
	width    int
	height   int
	boxColor int
}

func NewBlueBox(width int, height int) *blueBox {
	return &blueBox{
		width:    width,
		height:   height,
		boxColor: BLUE,
	}
}

func (b blueBox) Draw(locationX, locationY int) {
	fmt.Printf("Blue box drawn. %d,%d\n", locationX, locationY)
}
