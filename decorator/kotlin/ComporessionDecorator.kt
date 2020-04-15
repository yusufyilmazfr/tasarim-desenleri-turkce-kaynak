package Decorator

// Yeni davranışların tanımlandığı sınıftır.
// UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
// UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.

internal class ComporessionDecorator(dataSource: IDataSource) : BaseDataSourceDecorator(dataSource) {

    override val fileName: String
        get() = super.dataSource.fileName

    override fun readData() {
        // Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
        super.dataSource.readData()
    }

    override fun writeData(data: Any) {
        // Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
        println("Data compressed.")

        // Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
        println("Compressed data was written to " + super.dataSource.fileName)
    }
}
