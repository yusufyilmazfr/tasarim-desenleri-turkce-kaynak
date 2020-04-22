package Flyweight

fun main(args: Array<String>) {
    val boxFactory = BoxFactory()

    val blackBox1 = boxFactory.get(BoxColor.BLACK)
    val blackBox2 = boxFactory.get(BoxColor.BLACK)
    val blackBox3 = boxFactory.get(BoxColor.BLACK)
    val blueBox1 = boxFactory.get(BoxColor.BLUE)

    blackBox1!!.draw(97, 37)
    blackBox2!!.draw(34, 78)
    blackBox3!!.draw(74, 193)
    blueBox1!!.draw(1, 4)
    // output:
    //  Black box drawn. 97,37
    //  Black box drawn. 34,78
    //  Black box drawn. 74,193
    //  Blue box drawn. 1,4
}
