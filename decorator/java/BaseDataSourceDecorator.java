package Decorator;

// UML diyagramındaki Component (IDataSource) arayüzünü uygular.
// Constructor sayesinde özellikleri değiştirilmesi istenen nesnenin referansı tutulur.
// Bu sınıftan türeyen sınıfların uygulamasını, değiştirilmesini istediğimiz metotları abstract anahtar kelimesi ile işaretledik.
// UML diyagramındaki BaseDecorator yapısına denk gelmektedir.
abstract class BaseDataSourceDecorator implements IDataSource {
    protected IDataSource dataSource;

    public BaseDataSourceDecorator(IDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public abstract String getFileName();

    public abstract void readData();

    public abstract void writeData(Object data);
}