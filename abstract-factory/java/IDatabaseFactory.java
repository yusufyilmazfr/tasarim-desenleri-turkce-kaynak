package AbstractFactory;

// Oluşturulacak ürünlere ait metotları içerir.
// Oracle ve MySQL için bunların geriye döndüreceği
// Nesneler farklı olacaktır.
interface IDatabaseFactory {
    Connection createConnection();

    Command createCommand();
}