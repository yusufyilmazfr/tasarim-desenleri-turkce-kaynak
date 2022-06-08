> Bridge tasarım deseni, soyutlanmış (abstract) yapıyı implementasyonundan (uygulamasından) ayırmaya, bağımsız olarak geliştirilebilir iki yapı elde etmemize yarar. 

İstemci kodunu, implementasyonundan ayırmak için soyutlamayı kullanır ve genel olarak da kalıtımdan yararlanmaktayız. Bu işlemleri gerçekleştirirken de bir arayüz veya soyut bir sınıf tanımlarız ve ondan miras hiyerarşileri yaratırız. Her ne kadar ilk bakışta bu yaklaşım mantıklı görünse de ve yanlış bir şey olmasa da, miras yoluyla soyutlamalar her zaman esnek değildir. Kalıtım kullandığımızda, uygulamayı kalıcı olarak soyutlamaya bağlarız. Sonuç olarak, birinde yapılan herhangi bir değişiklik diğerini etkiler. Buradaki daha esnek bir yol, soyutlamayı ve uygulamayı ayırmaktır ve bridge tasarım deseni bu noktada devreye girer. 

Senaryo olarak kullanıcıların metin veya e-posta mesajı gibi farklı türde mesajlar göndermek için kullanabileceği bir mesajlaşma uygulamasını düşünelim. Sezgisel olarak  `Mesaj` adında temel bir interface ya da abstract class oluşturmak ardından da sınıfları bunlardan türetmek gerekiyor. Türetilmiş sınıflarımız; `TextMessage`  ve `EmailMessage` olacaktır. Son olarak da e-posta ve metin mesajını gönderme senaryolarını yapacağımız için `TextMessage` sınıfından türeyen bir `TextMessageSender` ve `EmailMessage` sınıfından türeyen `EmailMessageSender`  sınıflarını oluştururduk. Oluşturacağımız yapı aşağıdaki gibi olacaktır.

![bridge-old](./images/bridge-old.png)

Yukarıdaki tasarımı baktığımız zaman  tasarımımız kalıtım üzerine kuruludur ve doğası gereği bir dezavantajı da kapsüllemeyi kırmasıdır.

Bunun yanı sıra `TextMessage` ya da `EmailMessage` gibi yapılarda oluşacak herhangi bir değişiklik `TextMessageSender` veya `EmailMessageSender` gibi sınıfları etkilemektedir. Birbirinden bağımsız yapılar değil.  

Tekrar kullanılabilirlik açısından da olumsuz bir yana sahiptir. Mesaj gönderme işlemlerini başka bir projede kullanmak istediğimizde bu işlemleri gerçekleştiren sınıfların türediği sınıfları da beraberinde götürmemiz gerekcektir.

Bridge tasarım deseni burada abstraction ve implementation kısmını ayırarak birbirinden bağımsız geliştirilebilir yapılar elde etmemizi sağlar.

Aşağıda Bridge tasarım desenine ait diyagram görülmektedir.

![bridge-without-imp-and-abst](../../../images/bridge-without-imp-and-abst.png)

Yukarıdaki desene bakarak özetleyecek olursak:

- **Abstraction (Message):** Implementor (MessageSender) arayüzünü barındırır ve bu arayüzü uygulayan sınıfların metotlarını çağırmak için kullanılır.

- **RefinedAbstraction (TextMessage, EmailMessage):** Soyutlamayı uygulayan ya da onlardan türeyen sınıflardır.

- **Implementor (MessageSender):** İmplementasyonları gerçekleştiren sınıfların uyguladığı arayüzdür. Abstract (Message) sınıf tarafından referansı tutulur.

- **ConcreteImplementor(TextMessageSender, EmailMessageSender):** Implementor (MessageSender) arayüzünu uygulayan, gerçek işi yapan sınıflardır.

Verilen diyagrama ait kod örneği aşağıdaki gibi olacaktır.

C# Kod Örneği:

```csharp
// UML diyagramındaki Abstraction kısmına denk gelmektedir.
// Implementor (IMessageSender) arayüzünün referansını tutmaktadır.
public abstract class Message
{
    protected IMessageSender messageSender;

    public Message(IMessageSender messageSender)
    {
        this.messageSender = messageSender;
    }

    public abstract void Send();
}
```

```csharp
// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
public class EmailMessage : Message
{
    public EmailMessage(IMessageSender messageSender) : base(messageSender)
    {
    }

    public override void Send()
    {
        messageSender.SendMessage(this);
    }
}
```

```csharp
// UML diyagramındaki RefinedAbstraction kısmına denk gelmektedir.
// Abstraction (Message) sınıfından türer.
public class TextMessage : Message
{
    public TextMessage(IMessageSender messageSender) : base(messageSender)
    {
    }

    public override void Send()
    {
        messageSender.SendMessage(this);
    }
}
```

```csharp
// UML diyagramındaki Implementor (IMessageSender) arayüzünen denk gelmektedir.
// Abstraction (Message) tarafından referansı tutulur ve haberleşme burası ile gerçekleşir.
public interface IMessageSender
{
    void SendMessage(Message message);
}
```

```csharp
// UML diyagramındaki ConcreteImplementor (TextMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
public class TextMessageSender : IMessageSender
{
    public void SendMessage(Message message)
    {
        Console.WriteLine("TextMessageSender: Sending text message...");
    }
}
```

```csharp
// UML diyagramındaki ConcreteImplementor (EmailMessageSender) kısmına denk gelmektedir.
// Implementor arayüzünü (IMessageSender) uygular.
public class EmailMessageSender : IMessageSender
{
    public void SendMessage(Message message)
    {
        Console.WriteLine("EmailMessageSender: Sending email message...");
    }
}
```

```csharp
IMessageSender textMessageSender = new TextMessageSender();
Message textMessage = new TextMessage(textMessageSender);
textMessage.Send(); // output: TextMessageSender: Sending text message...

IMessageSender emailMessageSender = new EmailMessageSender();
Message emailMessage = new EmailMessage(emailMessageSender);
emailMessage.Send(); // output: EmailMessageSender: Sending email message...
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/bridge) bulabilirsiniz.*