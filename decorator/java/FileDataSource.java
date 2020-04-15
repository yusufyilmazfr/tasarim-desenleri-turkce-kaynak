package Decorator;

// Temel işlemlerin tanımlandığı IDataSource arayüzünü uygulayan sınıftır.
// UML diyagramındaki ConcreteComponent sınıfına denk gelmektedir.
class FileDataSource implements IDataSource {
    private String _fileName;

    public FileDataSource(String fileName) {
        _fileName = fileName;
    }

    public String getFileName() {
        return _fileName;
    }

    public void readData() {
        System.out.println(_fileName + " readed.");
    }

    public void writeData(Object data) {
        System.out.println("data was written to " + _fileName);
    }
}
