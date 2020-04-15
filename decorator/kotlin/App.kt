package Decorator

fun main(args: Array<String>) {
    val dataSource = FileDataSource("data.sql")

    val compressedDataSource = ComporessionDecorator(dataSource)

    compressedDataSource.readData()
    compressedDataSource.writeData(Any())

    // output:
    //      data.sql readed.
    //      Data compressed.
    //      Compressed data was written to data.sql
}
