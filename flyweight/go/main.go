package main

func main() {
	boxFact := NewBoxFactory()

	blackBox1 := boxFact.Get(BLACK)
	blackBox2 := boxFact.Get(BLACK)
	blackBox3 := boxFact.Get(BLACK)
	blueBox1 := boxFact.Get(BLUE)

	blackBox1.Draw(97, 37)
	blackBox2.Draw(34, 78)
	blackBox3.Draw(74, 193)
	blueBox1.Draw(1, 4)
	// output:
	//  Black box drawn. 97,37
	//  Black box drawn. 34,78
	//  Black box drawn. 74,193
	//  Blue box drawn. 1,4
}
