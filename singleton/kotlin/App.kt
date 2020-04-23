package singleton

fun main() {
    val firstInstanceRequest = Database.getInstance()
    val secondInstanceRequest = Database.getInstance()

    val isEquals = firstInstanceRequest == secondInstanceRequest

    print("Database referance is equals: $isEquals") //output: Database referance is equals: true
}