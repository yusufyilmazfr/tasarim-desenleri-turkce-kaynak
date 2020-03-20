package Adapter

fun main(args: Array<String>) {
    val customOperation = CustomOperation(CustomSerializerAdapter())
    val serializedObject = customOperation.SerializeObject(Any())

    println(serializedObject)
}
