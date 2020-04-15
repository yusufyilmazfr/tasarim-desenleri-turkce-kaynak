package Decorator

// UML diyagramındaki Component (IDataSource) arayüzünü uygular.
// Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
// Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
internal abstract class BaseDataSourceDecorator(protected var dataSource: IDataSource) : IDataSource {

    abstract override val fileName: String

    abstract override fun readData()

    abstract override fun writeData(data: Any)
}