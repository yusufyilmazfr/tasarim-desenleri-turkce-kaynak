> Factory tasarım deseni birbirleri ile ilişkili nesneleri oluşturmak için bir arayüz sağlar ve alt sınıfların hangi sınıfın örneğini oluşturacağına olanak sağlar. 

Buradaki amaç istemci tarafından birbirleri ile ilişkili nesnelerin oluşturulma anını soyutlamak, **istemci hangi sınıf örneğini alabileceğini bilebilir ama oluşturulma detayları bilmez**. Detaylar yani nesnenin nasıl oluşturulacağı soyutlanır. Örneğin oluşturulan sınıfın `Singleton` olarak oluşturulması gibi.

![factory-pattern](../../../images/factory-pattern.png)

C# Kod Örneği:

```csharp
public class User
{
    // Burada bildirimin gideceği kullanıcıya
    // ait bilgiler bulunacaktır.
}
```

```csharp
// UML diyagramındaki IProduct arayüzümüze denk gelmektedir.
// İlişkili sınıflarımız bu arayüzü uygulayacaktır.
interface INotify
{
    void SendNotification(User user);
}
```

```csharp
// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
class MailNotify : INotify
{
    public void SendNotification(User user)
    {
        // Mail gönderme operasyonu.
    }
}
```

```csharp
// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
public class SmsNotify : INotify
{
    public void SendNotification(User user)
    {
        // SMS gönderme operasyonu.
    }
}
```

```csharp
// UML diyagramındaki ProductFactory sınıfına denk gelmektedir.
class NotifyFactory
{
    public INotify CreateNotify(string notifyType)
    {
        if (notifyType == "SMS")
        {
            // Buradaki nesne oluşturma süreçleri bize kalmıştır.
            // Kullanıcıdan soyutlanmıştır.
            // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return new SmsNotify();
        }
        else if (notifyType == "MAIL")
        {
            // Buradaki nesne oluşturma süreçleri bize kalmıştır.
            // Kullanıcıdan soyutlanmıştır.
            // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return new MailNotify();
        }
        return null;
    }
}
```

```csharp
NotifyFactory notifyFactory = new NotifyFactory();

INotify notify = notifyFactory.CreateNotify("MAIL");

notify.SendNotification(new User());
```

Yukarıdaki kodda da görüldüğü gibi `INotify` arayüzünü uygulayan sınıfların oluşturulması istemciden soyutlanmıştır.

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/factory) bulabilirsiniz.*


