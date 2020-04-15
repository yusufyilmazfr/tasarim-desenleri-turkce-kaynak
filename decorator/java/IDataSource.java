package Decorator;

// Üst sınıfların uygulayacağı arayüzdür.
// Yapılacak temel işlemler tanımlanmıştır.
// UML diyagramındaki Component arayüzüne denk gelmektedir.
interface IDataSource
{
    String getFileName();
    void writeData(Object data);
    void readData();
}
