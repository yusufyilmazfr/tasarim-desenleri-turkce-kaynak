> Abstract Factory tasarım deseni birbirleri ile ilişkili ürün ailesini oluşturmak için bir arayüz sağlar.

Factory tasarım deseninde bir ürünün oluşturulması soyutlanmış iken Abstract Factory deseninde birbirleri ile ilişkili ürün ailelerininin oluşturulması soyutlanmıştır. **Factory üreten Factory deseni olarak da düşünülebilir.** 🧐

Anlayacağımız; birden fazla ürün ailesi ile çalışmak zorunda kaldığımız durumlarda, istemciyi bu yapılardan soyutlamak için Abstract Factory doğru bir yaklaşım olacaktır.

![abstract-factory-uml](../../../images/abstract-factory-uml.png)

**ProductA**, **ProductB**: Temel sınıflarımız, soyuttur ve oluşturulmasını istediğimiz sınıflar bunlardan türer.

**ConcreteProduct**: Üretmek istediğimiz sınıflardır.

**AbstractFactory**: Herbir sınıfın oluşturulması için metotların tanımlandığı arayüzdür.

**ConcreteFactory**: `AbstractFactory` arayüzünü uygulayarak gerekli sınıfların oluşturulmasını sağlar.

Şöyle bir senaryo düşünülebilir; sistemimiz isteğe bağlı Oracle ya da MySQL için sorgu çalıştırabilir olsun. Bu işlemler için temel olarak da bağlantının açılması, kapatılması ve sorgunun çalıştırılması gerekli olduğu varsayalım.  Bu işlemler direkt olarak herbiri Factory desen olarak ayarlanabilir ama birbirleri ile ilişkili aileden geldikleri için bu desene daha sağlıklı olacaktır. 

C# Kod Örneği:

```csharp
// Soyut sınıfımızdır.
// UML'deki Product sınıfına denk gelmektedir.
public abstract class Command
{
    public abstract void ExecuteCommand(string query);
}
```

```csharp
// Command sınıfından türer.
// UML'deki ConcreteProduct sınıfına denk gelmektedir.
class MySQLCommand : Command
{
    public override void ExecuteCommand(string query)
    {
        // Gelen sorgunun çalıştırılması için
        // Gerekli operasyonel işlemler...
    }
}
```

```csharp
// Command sınıfından türer.
// UML'deki ConcreteProduct sınıfına denk gelmektedir.
class OracleCommand : Command
{
    public override void ExecuteCommand(string query)
    {
        // Gelen sorgunun çalıştırılması için
        // Gerekli operasyonel işlemler...
    }
}
```

```csharp
// Soyut sınıfımızdır.
// UML'deki Product sınıfına denk gelmektedir.
abstract class Connection
{
    public abstract bool OpenConnection();
    public abstract bool CloseConnection();
}
```

```csharp
// Connection sınıfından türer.
// UML'deki ConcreteProduct sınıfına denk gelmektedir.
class MySQLConnection : Connection
{
    public override bool OpenConnection()
    {
        // MySQL veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
    public override bool CloseConnection()
    {
        // MySQL veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
}
```

```csharp
// Connection sınıfından türer.
// UML'deki ConcreteProduct sınıfına denk gelmektedir.
class OracleConnection : Connection
{
    public override bool OpenConnection()
    {
        // Oracle veri tabanı bağlantısının açılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
    public override bool CloseConnection()
    {
        // Oracle veri tabanı bağlantısının kapatılması için
        // Gerekli operasyonel işlemler...
        return true;
    }
}
```

```csharp
// Oluşturulacak ürünlere ait metotları içerir.
// UML'deki AbstractFactory sınıfına denk gelmektedir.
interface IDatabaseFactory
{
    Connection CreateConnection();
    Command CreateCommand();
}
```

```csharp
// Oracle için ilişkili nesneler üretildi.
// UML'deki ConcreteFactory sınıfına denk gelmektedir.
class OracleDatabaseFactory : IDatabaseFactory
{
    public Command CreateCommand()
    {
        return new OracleCommand();
    }
    public Connection CreateConnection()
    {
        return new OracleConnection();
    }
}
```

```csharp
// MySQL için ilişkili nesneler üretildi.
// UML'deki ConcreteFactory sınıfına denk gelmektedir.
class MySQLDatabaseFactory : IDatabaseFactory
{
    public Command CreateCommand()
    {
        return new MySQLCommand();
    }

    public Connection CreateConnection()
    {
        return new MySQLConnection();
    }
}
```

```csharp
// IDatabaseFactory arayüzünü uygulayan sınıfları
// Kullanarak temel operasyonel işlemleri yapan bir sınıf.
class CustomOperation
{
    IDatabaseFactory _databaseFactory;
    Connection _connection;
    Command _command;

    public CustomOperation(IDatabaseFactory databaseFactory)
    {
        _databaseFactory = databaseFactory;
        _command = databaseFactory.CreateCommand();
        _connection = databaseFactory.CreateConnection();
    }

    public void RemoveById(int id)
    {
        _connection.OpenConnection();
        _command.ExecuteCommand("DELETE ...");
        _connection.CloseConnection();
    }
}
```

```csharp
CustomOperation customOperation = new CustomOperation(new OracleDatabaseFactory());
customOperation.RemoveById(1);
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/abstract-factory) bulabilirsiniz.*