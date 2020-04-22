package Iterator

fun main(args: Array<String>) {
    val employeeListAggregate = EmployeeListAggregate()

    val yusuf = Employee(1, "Yusuf", "Yılmaz")
    val arafat = Employee(2, "Arafat", "Önlük")
    val derya = Employee(3, "Derya", "Obi")

    employeeListAggregate.add(yusuf)
    employeeListAggregate.add(arafat)
    employeeListAggregate.add(derya)

    val iterator = employeeListAggregate.createIterator()

    while (iterator.hasNext()!!) {
        val currentEmployee = iterator.currentItem
        val message = String.format("%s %s", currentEmployee.firstName, currentEmployee.lastName)
        println(message)
    }

    // output:
    //  Yusuf Yılmaz
    //  Arafat Önlük
    //  Derya Obi
}
