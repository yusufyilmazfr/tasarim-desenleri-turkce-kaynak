package Decorator;

public class App {
    public static void main(String[] args) {
        IDataSource dataSource = new FileDataSource("data.sql");

        IDataSource compressedDataSource = new ComporessionDecorator(dataSource);

        compressedDataSource.readData();
        compressedDataSource.writeData(new Object());

        // output:
        //      data.sql readed.
        //      Data compressed.
        //      Compressed data was written to data.sql
    }
}
