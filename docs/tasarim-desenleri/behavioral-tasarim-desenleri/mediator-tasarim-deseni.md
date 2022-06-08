> Mediator tasarım deseni, aynı tipteki veya aynı arayüzü uygulayan nesneler arasında iletişimi sağlayan tasarım desenidir.

Nesneler arasında direkt iletişim kurmaktansa, ortaya bir ara sınıf (Mediator) koyarak tüm haberleşme işlerini bu ortak nesne üzerinden gerçekleştirerek direkt olarak birbirileri ile haberleşmelerini engellemektir bu desendeki amacımız. Bunların yanı sıra sınıfların sayısı arttıkça, aralarındaki bağımlılıklar da artar, uygulamanın bakımı ve değiştirilmesi zorlaşır. Mediator tasarım deseni,  bu sınıflar arasındaki bağımlılıkları azaltmaya ve aralarındaki iletişimi kolaylaştırmaya da yarar.

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![mediator-uml](../../../images/mediator-uml.png)

- **Mediator:** `Colleague` nesneler arasındaki iletişim arayüzünü tanımlar.

- **ConcreteMediator:** `Mediator` arayüzünü uygular  ve `Colleague` nesneleri arasındaki iletişimi koordine eder.

- **Colleague:** Haberleşme için ortak bir arayüz sağlar.

- **ConcreteColleague:** `Colleague` arayüzünü uygular ve diğer `Mediator` sayesinde diğer `Colleague`  sınıf örnekleri ile iletişim kurmaya çalışır.

Senaryo olarak online bir sohbet odası olduğu ve bu odada kullanıcıların 1-1 görüşme yaptıkları kabul edilsin. Desen gereği kullanıcılar direkt birbirleri ile iletişim kuramayacakları için işlemler `Mediator `üzerinden gerçekleştirilecektir.

C# Kod Örneği:

```csharp
// Haberleşme için ortak bir arayüz sağlar.
// Haberleşme Mediator tarafından gerçekleşeceği için bir örneğini tutar.
// Mesaj alma ve mesaj gönderme özellikleri içermektedir.
// UML diyagramındaki Colleague yapısına denk gelir.
abstract class User
{
    public int id;
    public string name;

    private IChatRoomMediator _chatRoomMediator;

    public User(IChatRoomMediator chatRoomMediator)
    {
        _chatRoomMediator = chatRoomMediator;
    }

    public void ReceiveMessage(string message)
    {
        Console.WriteLine($"{name} received new message. Message: {message}");
    }

    public void SendMessage(string message, int userId)
    {
        Console.WriteLine($"{name} send new message to: {userId} id user.");
        _chatRoomMediator.SendMessage(message, userId);
    }
}
```

```csharp
// Colleague (User) soyutundan türer.
// Mediator sayesinde diğer sınıf örnekler ile iletişim kurar.
// UML diyagramındaki ConcreteColleague yapısına denk gelmektedir.
class ChatUser : User
{
    public ChatUser(IChatRoomMediator chatRoomMediator) : base(chatRoomMediator)
    {

    }
}
```

```csharp
// Colleague (User) nesneler arasındaki iletişim arayüzünü tanımlar.
// UML diyagramındaki Mediator arayüzüne denk gelmektedir.
interface IChatRoomMediator
{
    void SendMessage(string message, int userId);
    void AddUserInRoom(User user);
}
```

```csharp
// Mediator (IChatRoomMediator) arayüzünü uygular.
// Colleague (User) nesneleri arasındaki iletişimi koordine eder.
// UML diyagramındaki ConcreteMediator yapısına denk gelmektedir.
class ChatRoomMediator : IChatRoomMediator
{
    private Dictionary<int, User> _userDictionary;

    public ChatRoomMediator()
    {
        _userDictionary = new Dictionary<int, User>();
    }

    public void AddUserInRoom(User user)
    {
        _userDictionary.Add(user.id, user);
    }

    public void SendMessage(string message, int userId)
    {
        User user = _userDictionary[userId];
        user.ReceiveMessage(message);
    }
}
```

```csharp
IChatRoomMediator chatRoom = new ChatRoomMediator();

// Sohbet odasına dahil olacak kullanıcıların oluşturulması.
// Ortak Mediator arayüzü ile haberleşmesi.
User yusuf = new ChatUser(chatRoom);
yusuf.id = 1;
yusuf.name = "Yusuf";

User sema = new ChatUser(chatRoom);
sema.id = 2;
sema.name = "Semanur";

User derya = new ChatUser(chatRoom);
derya.id = 3;
derya.name = "Derya";

User aleyna = new ChatUser(chatRoom);
aleyna.id = 4;
aleyna.name = "Aleyna";

// Mediator içerisindeki kullanıcı listesine atama işlemleri.
chatRoom.AddUserInRoom(yusuf);
chatRoom.AddUserInRoom(sema);
chatRoom.AddUserInRoom(derya);
chatRoom.AddUserInRoom(aleyna);

yusuf.SendMessage("Naber kız?", sema.id);
sema.SendMessage("Sanane be?", yusuf.id);

// output:
//  Yusuf send new message to: 2 id user.
//  Semanur received new message.Message: Naber kız?
//  Semanur send new message to: 1 id user.
//  Yusuf received new message.Message: Sanane be?
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/mediator) bulabilirsiniz.*