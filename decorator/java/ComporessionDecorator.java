package Decorator;

// Yeni davranışların tanımlandığı sınıftır.
// UML diyagramındaki BaseDecorator (BaseDataSourceDecorator) sınıfından türer.
// UML diyagramındaki ConcreteDecorator sınıfına denk gelmektedir.

class ComporessionDecorator extends BaseDataSourceDecorator {
    public ComporessionDecorator(IDataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String getFileName() {
        return super.dataSource.getFileName();
    }

    @Override
    public void readData() {
        // Veriyi okurken referansını tuttuğumuz sınıfın kendi davranışını sergilemesini istiyoruz.
        super.dataSource.readData();
    }

    @Override
    public void writeData(Object data) {
        // Burada gelen veriye ait sıkıştırma işlemleri yapılacaktır.
        System.out.println("Data compressed.");

        // Sıkıştırma işlemleri yapıldıktan sonra yazma işlemleri gerçekleştirilecektir.
        System.out.println("Compressed data was written to " + super.dataSource.getFileName());
    }
}
