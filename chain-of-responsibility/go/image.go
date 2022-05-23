package main

// Image uygulama süresince resimlerimizi temsil edecek sınıf.
type Image struct {
	Name      string
	Extension string
}

func NewImage(name string, extension string) *Image {
	return &Image{
		Name:      name,
		Extension: extension,
	}
}
