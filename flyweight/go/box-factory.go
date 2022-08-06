package main

// Flyweight (Box) havuzunu tutacak sınıftır.
// Eğer daha önceden nesne oluşturulmamışsa havuza atılacak.
// Oluşturulmuş ise de havuzdan seçilip verilecektir.
// UML diyagramındaki FlyweightFactory sınıfına denk gelmektedir.
type boxFactory struct {
	boxes map[int]Box
}

func NewBoxFactory() *boxFactory {
	return &boxFactory{
		boxes: make(map[int]Box),
	}
}

func (f *boxFactory) Get(boxColor int) Box {
	if box, ok := f.boxes[boxColor]; ok {
		return box
	}

	var box Box

	switch boxColor {
	case BLACK:
		box = NewBlackBox(20, 20)
	case BLUE:
		box = NewBlueBox(20, 20)
	}

	f.boxes[boxColor] = box
	return box
}
