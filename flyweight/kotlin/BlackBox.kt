package Flyweight

// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
internal class BlackBox(width: Int, height: Int) : Box() {
    init {
        this.width = width
        this.height = height
        this.boxColor = BoxColor.BLACK
    }

    override fun draw(locationX: Int, locationY: Int) {
        val message = String.format("%s box drawn. %d,%d", boxColor, locationX, locationY)
        println(message)
    }
}
