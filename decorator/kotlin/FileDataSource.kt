package Decorator

// Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
internal class FileDataSource(override val fileName: String) : IDataSource {

    override fun readData() {
        println("$fileName readed.")
    }

    override fun writeData(data: Any) {
        println("data was written to $fileName")
    }
}
