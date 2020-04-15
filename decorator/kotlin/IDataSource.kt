package Decorator

// Üst sınıfların uygulayacağı arayüzdür.
// Yapılacak temel işlemler tanımlanmıştır.
// UML diyagramındaki Component arayüzüne denk gelmektedir.
internal interface IDataSource {
    val fileName: String
    fun writeData(data: Any)
    fun readData()
}
