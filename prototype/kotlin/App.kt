package Prototype

fun main(args: Array<String>) {
    val gulizar = Employee("Gülizar", "Yılmaz")
    val cloneGulizar = gulizar.cloneObject()

    // Aynı nesne örneklerini farklı referanslarda tutuyor.
    // Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
    println(gulizar == cloneGulizar) //output: false
}