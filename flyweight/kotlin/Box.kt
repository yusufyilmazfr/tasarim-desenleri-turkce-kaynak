package Flyweight

// Nesnenin ortak özelliklerini tutan sınıftır.
// UML diyagramındaki Flyweight yapısına denk gelmektedir.
internal abstract class Box {
    // Intrinsic değerler.
    var width: Int = 0
    var height: Int = 0
    var boxColor: BoxColor? = null

    abstract fun draw(locationX: Int, locationY: Int)
}
