package main

import "fmt"

func main() {
	textOrginator := NewTextOrginator()

	textOrginator.Text = "asm"
	textOrginator.CursorPosition = 3

	// Anlık durum yığına ekleniyor.
	textOrginator.Save()

	textOrginator.Text = "asmi"
	textOrginator.CursorPosition = 4

	// Anlık durum yığına ekleniyor.
	textOrginator.Save()

	textOrginator.Text = "asmin"
	textOrginator.CursorPosition = 5

	// Anlık durum yığına ekleniyor.
	textOrginator.Save()

	// Yığındaki bir önceki duruma geçiyor.
	textOrginator.Undo()
	fmt.Println(textOrginator.ToString())

	// Yığındaki bir önceki duruma geçiyor.
	textOrginator.Undo()
	fmt.Println(textOrginator.ToString())

	// Yığındaki bir önceki duruma geçiyor.
	textOrginator.Undo()
	fmt.Println(textOrginator.ToString())

	// output:
	//  text: asmin, cursor position: 5
	//  text: asmi, cursor position: 4
	//  text: asm, cursor position: 3
}
