![tasarim-desenleri-turkce-kaynak](./images/tasarim-desenleri-turkce-kaynak-2.png)

---

*Başlamadan önce: kaynağa destek olabilir ve daha çok kişiye erişmesini sağlayabilirsiniz.* 🎉⭐

---

### İçindekiler

1. [Giriş ve Tanışma]()
2. [Nesne Yönelimli Programlama Nedir?]()
   - [Sınıf Hiyerarşileri]()
   - [Nesne Yönelimli Programlama İlkeleri]()
     - [Abstraction (Soyutlama)]()
     - [Encapsulation (Kapsülleme)]()
     - [Inheritance (Kalıtım)]()
     - [Polymorphism (Çok Biçimlilik)]()
   - [Nesneler Arası İlişkiler]()
     - [Inheritance (Kalıtım)]()
     - [Implementation]()
     - [Association (Bağlantı)]()
     - [Dependency (Bağımlılık)]()
     - [Composition(Bileşim)]()
     - [Aggregation(İçerme)]()
3. [S.O.L.I.D Nedir?]()
   - [Single Responsibility (Tek Sorumluluk Prensibi)]()
   - [Open/Closed Principle (Açık Kapalı Prensibi)]()
   - [Liskov Substitution (Liskov’un Yerine geçme Prensibi)]()
   - [Interface Segregation (Arayüz Ayrımı Prensibi)]()
   - [Dependency Inversion (Bağımlılıkların Tersine Çevrilmesi Prensibi)]()
4. [Tasarım Deseni Nedir?]()
5. [Tasarım Desenleri]()
   - [Creational  (Oluşturucu)]()
     - [Singleton]()
     - [Factory]()
     - [Abstract Factory]()
     - [Builder]()
     - [Prototype]()
   - [Structural (Yapısal)]()
     - [Adapter]()
     - [Bridge]()
     - [Composite]()
     - [Decorator]()
     - [Facade]()
     - [Flyweight]()
     - [Proxy]()
   - [Behavioral (Davranışsal)]()
     - [Chain of Responsibility]()
     - [Command]()
     - [Iterator]()
     - [Mediator]()
     - [Memento]()
     - [Observer]()
     - [State]()
     - [Strategy]()
     - [Template Method]()
     - [Visitor]()
6. [Kapanış]()
7. [Kaynakçalar]()

## Giriş ve Tanışma

Merhabalar.👋

Ben Yusuf, K.T.Ü yazılım mühendisliği öğrencisiyim. Oluşturduğum bu kaynak ile; tasarım desenlerini bilmeyen kişiler için öğrenmeyi, bilgisi olan kişiler için de bilgilerini güncel tutacağı ve bir problem olduğunda danışacağı bir başucu kaynağı olmasını hedefliyorum. Bu kaynağın ortaya çıkış amacından da kısaca bahsedecek olursam; çevremdeki insanların, takip ettiğim kişilerin Türkçe kaynak oluşturma konusunda bir çaba içerisinde olduğunu fark ettim. Kimileri blog, haftalık okumalar, bültenler ya da kitap yazarak kimileri de eğitim videoları çekerek. Ben de bu zincire katılarak elimden geldiğince faydalı olmaya çalışmak istedim ve bu kaynağı oluşturmaya karar verdim.

## Nesne Yönelimli Programlama Nedir?

Nesne yönelimli programlama paradigması, gerçek hayatta olan varlıkları yazılım dünyasında modellemekte kullandığımız, her işlevin nesneler olarak soyutlandığı bir programalama yaklaşımıdır. Tıpkı gerçek hayatta olduğu gibi yazılımda da bu sayede nesnelerimizin öznitelikleri, davranışları olacaktır.

Ortaya çıkış nedenlerinden bazıları da yazılımda; karmaşıklığı azaltmaya, bakım maliyetini düşürmeye, modülariteyi artırmaya, nesneler arası hiyerarşiyi kurmaya yaramasıdır.    

### Nesneler, Sınıflar

![developer-uml](./images/developer-uml.png)

Yukarıda `Developer` adında bir sınıf görülmektedir. <code>Sınıf</code> alanlar(fields) ve davranışlarımızın(methods) tanımlandığı yerdir. <code>Nesne</code> ise bu sınıftan bir örnek alınmış halidir.

![developer-yusuf-halit](./images/developer-yusuf-halit.png)

Diyelim ki Yusuf adında bir geliştiriciniz var. Yusuf bir nesne, `Developer` sınıfının bir örneğidir. Her `Developer`'ın birçok standart özelliği vardır: isim, yaş, ağırlık vb. Bunlar sınıfın alanları, öznitelikleridir.

Tüm geliştiriciler de benzer şekilde davranırlar: uyurlar, yerler, kod yazarlar. Bunlar sınıfın davranışlarıdır. Toplu olarak yukarıda da bahsettiğimiz gibi alanlar ve davranışlar sınıflarının üyeleri olarak başvurulabilir.

Bir diğer geliştiriciniz Halit de  `Developer` sınıfının bir örneğidir. Yusuf ile aynı özelliklere sahiptir. Fark bu özelliklerin değerlerinde: isimleri farklı, yaş olarak daha büyük ve daha hafif.

Yani bir sınıf, o sınıfın somut örnekleri olan nesnelerin yapısını tanımlayan bir taslak gibidir.

### Sınıf Hiyerarşileri

Yukarıdaki örnekte bir adet sınıf kullanıldı ama gerçek uygulamalarda bildiğimiz gibi bir sınıftan daha fazlası mevcut. Bunlar arasında bir hiyerarşi, düzen mevcut. Tıpkı gerçek hayatta olduğu gibi.  Biyoloji bunun için en iyi örnektir. İnekler ve kargalar aynı atadan gelirler, bu yüzden inekler ve kargaların ortak noktaları mecvuttur, bunlar; isim, cinsiyet, ayak sayısı gibi nitelikilerdir. Kargalar beslenebilir, uyuyabilir ve ineklerin yaptığı yaptığı gibi koşabilir. Biyolojide de olduğu gibi; yazılımda da bir hiyerarşi kurabilir, ortak nitelikleri ve davranışları listeleyecek temel `Hayvan` sınıfını tanımlayabiliriz.    

Hiyerarşi düzeninde; genel, kapsayıcı sınıfa  <code>superclass</code> (üst sınıf). Bunlardan türeyen sınıflara da <code>subclasses</code> (alt sınıflar) denir. Bu hiyerarşi ile birlikte alt sınıflar, üst sınıfların özelliklerini ve davranışlarını almaktadır. 

![cow-crow-uml](./images/cow-crow-uml.png)

Bahsettiğimiz hiyerarşi yukarıda da gösterilmiştir. <code>Animal</code> adında bir <code>superclass</code> (üst sınıf) ve bulardan türeyen <code>subclasses</code> (alt sınıflar) mevcut. Bu alt sınıflar, üst sınıfın niteliklerini ve davranışlarını almaktadır. Bu yüzden kendi içlerinde tekrar yazmaya gerek yoktur. Ortak özeliklerin yanı sıra kendilerine has olan özellikler de kendi içlerinde tanımlanmıştır. Örneğin; `Cow` sınıfı içerisinde ineklere özgü olan süt sağma eylemi `milking()` fonksiyonu içerisinde gerçekleştirilmiştir. `Crow` sınıfına özel nitelikler ve davranışlar da kendi içerisinde tanımlanmıştır.

![organism-uml](./images/organism-uml.png)

Bazı durumlarda UML diyagramlarında sınıfların barındırdığı nitelik ve davranışlardan ziyade bulunduğu hiyerarşi daha önemlidir, bu tür durumlarda yukarıdaki gibi basit bir tanımlama kullanılmaktadır.

### Nesne Yönelimli Programlama İlkeleri

Nesne yönelimli programalama 4 temel ilke üzerine kuruludur ve bir dilin, nesne yönelimli programlamayı uyguluyor denmesi için 4 koşulu da sağlıyor olması gerekiyor. Bunlar; `Encapsulation`, `Abstraction`,  `Inheritance`, `Polymorphism`

![oop-pillars](./images/oop-pillars.png)

#### Encapsulation (Kapsülleme)

Herhangi bir nesnenin metotlarını, verilerini veya değişkenlerini diğer nesnelerden saklayarak ve bunlara erişimini sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir. Bir nesne üzerinde hem veri soyutlama hem de kontrol soyutlaması yapılıyor ise buna sarma adı verilir. Çoğu programlama dilleri kapsüllemeyi aşağıda sıraladığımız erişim belirteçleri ile desteklerler.

1. **public:** Erişimin her yerden yapılabileceği anlamı taşıyor.

2. **private:** Erişimin tanımlandığı sınıf içerisinden yapılabileceği anlamı taşıyor.

3. **protected:** Sadece tanımlandığı sınıfın içinden veya o sınıftan türetilmiş diğer sınıfların içinden erişilebilir.

#### Abstraction (Soyutlama)

Farklı kod parçalarının kompleks kısımlarını, sahip oldukları ortak davranışlar, amaçlar, karakteristik özellikler arkasında saklamak sayesinde daha anlaşılır ve kolay kullanılabilir kod yazmaktır abstraction.

#### Inheritance (Kalıtım)

Kalıtım, mevcut sınıfların üzerine yeni sınıflar oluşturma yeteneğidir. Bu sayede türetilen sınıf, türediği sınıfın özelliklerini devralır. Kalıtımın en büyük yararı kodun yeniden kullanılmasıdır. Mevcut sınıftan biraz farklı bir sınıf oluşturmak istiyorsak, kodu kopyalamamıza gerek yoktur. Bunun yerine, varolan sınıfı genişletir ve ekstra işlevselliği alt sınıfa koyarız.    

![human-uml](./images/human-uml.png)

Çoğu programlama dilinde **yalnızca bir sınıftan türetme işlemi gerçekleştirilmektedir** ama birden fazla interface'den(ara birimden) türetilme işlemi de gerçekleştirilebilmektedir. 

#### Polymorphism (Çok Biçimlilik)

Bir nesnenin başka bir nesne gibi davranabilmesi, kullanılabilmesi. Biraz daha açık bir ifade ile: alt sınıfların, üst sınıflara ait olan davranışlarını başka bir biçimde gerçekleştiriyor olması olayıdır. 

![uml-poly-logger-service](./images/uml-poly-logger-service.png)    

Yukarıda `ILoggerService` adında bir `Interface` ve içerisinde de `log()` adında metotu bulunmaktadır.  Bu interface'den türetilen `DatabaseLoggerService` ve `FileLoggerService` sınıfları, metotu implemente etmek(uygulamak) zorundadır ve kendince uygulayacaktır ki bundan dolayı da bu metota ait farklı davranışlar söz konusu olacaktır.

```java
43    ...
44    ...
45    loggerServices = new ILoggerService[] { 
46      new DatabaseLoggerService(), new FileLoggerService() };
47
48     foreach (ILoggerService loggerService : loggerServices)
49         loggerService.log(data)
50    ...

output: // Logged with database logger
output: // Logged with file logger
```

Nesnenin davranışı çalışma anında belirlendiği için, çok biçimlilik özelliği sayesinde nesnelerin türünü önceden bilmek zorunda kalmayız.

### Nesneler Arası İlişkiler

Bu kısımda kaynağın herkese hitap etmesi açısından temel düzeyde de olsa UML diyagramlarındaki sınıflar arasındaki ilişkilere değiniyor olacağız.

#### Inheritance

![uml-inheritance](./images/uml-inheritance.png)

Sınıflar arası kalıtımı gösterir. Alt sınıftan üst sınıfa doğru içi boş ok ile gösterilir.

#### Implementation

![uml-realization](./images/uml-realization.png)

Arayüzler ile sınıflar arasındaki ilişkiyi gösterir.

#### Association (Bağlantı)

![uml-association](./images/uml-association.png)

Bir nesnenin başka bir nesneyi kullandığı veya onunla etkileşime girdiği bir ilişki türüdür. Kullanılmak istenen nesneye ok işareti ile refere edilir. **Sınıflar arasında HAS-A ilişkisi bulunuyor.** 

#### Dependency (Bağımlılık)

![uml-dependency](./images/uml-dependency.png)

Genellikle nesneler arasında kalıcı bir bağlantı olmadığını ima eden daha zayıf bir ilişki çeşididir. Bağımlılık genellikle (ancak her zaman değil), bir nesnenin başka bir nesneyi bir parametre olarak kabul ettiğini, başlattığını veya başka bir nesneyi kullandığını gösterir. Sınıflar arasındaki bağımlılığı nasıl tespit edebileceğiniz aşağıda açıklanmıştır: **Bir sınıfın tanımında yapılan değişiklikler başka bir sınıfta değişikliklere neden oluyorsa iki sınıf arasında bir bağımlılık vardır.**

#### Composition(Bileşim)

![uml-composition](./images/uml-composition.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşımazlar**. Yukarıdaki örneğe bakılacağı zaman firma konumlardan oluşmaktadır, ayrılma durumu yoktur, bağımlıdır, konum tek başına bir anlam ifade etmez.

#### Aggregation(İçerme)

![uml-aggregation](./images/uml-aggregation.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşıyabilirler**. Yukarıdaki örneğe bakılacağı zaman havalimanı uçakları içerir, ayrılma durumu olabilir, sıkı sıkıya bağımlılık yoktur, uçak tek başına bir anlam ifade edebilir.

## S.O.L.I.D Nedir?

> S.O.L.I.D, yazılım geliştirirken sürdürülebilir kod yazmamızı sağlayan bir prensiptir. 

Buradaki sürdürülebilirlikten kasıt; yazılım gereksinimleri değiştiğinde ya da mevcut yazılıma eklemeler yapıldığında sistemin buna direnç göstermemesi, en azından en az direnci göstermesi yani esnek olmasıdır. Bunların yanı sıra bakımının ve anlaşılmasının kolay olması gibi nedenler de sayılabilir.

Bunları yapmamızı sağlayan prensipleri 5 madde içerisinde inceleyeceğiz.

### Single Responsibility Principle (Tek Sorumluluk Prensibi)

> Her sınıf, metot, fonksiyon tek bir sorumluluğa sahip olmalıdır.

Şayet bu kurala uymazsak ilerleyen süreçte bir değişikliğe gidildiğinde bunun etkisini birçok yerde görmüş oluruz. Nedeni ise bir yapıya birden fazla sorumluluk yüklenmesinden dolayıdır. Eğer değişikliklerden etkilenen yerler arasında sistemin birçok yerinde kullanılan bir yapımız da varsa maliyet gittikçe artacaktır.   

![single-res-person](./images/single-res-person.png)

JAVA Kod Örneği:

```java
public class Person {
    public String firstName;

    public void sendPasswordResetLink() {
        ...
    }
}
```

Yukarıdaki diyagrama ve koda baktığımızda `Person` sınıfı içerisinde `sendPasswordResetLink()` diye bir metot bulunmaktadır. Bu sınıfın asıl amacı kişilere ait bilgileri tutmaktır, şifre sıfırlama bağlantısı göndermek değil. Birden fazla sorumluluk yüklendiği için olası bir mail gönderme değişikliğinde bu sınıf da etkilenecektir.

Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir.

![single-res-person-2](./images/single-res-person-2.png)

JAVA Kod Örneği:

```java
class Person {
     public String firstName;
}

class EmailService {
    public void sendPasswordResetLink(Person person) {
        ...
    }
}
```

### Open/Closed Principle (Açık Kapalı Prensibi)

> Yapılarımız (sınıf, metot, fonksiyon) gelişime açık değişime kapalı olmalıdır.

Yazılımlar için zamanla değişim şüphesiz kaçınılmazdır; değişen iş kuralları, kullanılan harici kütüphaneler gibi başlıca nedenler örnek gösterilebilir. Bu prensibin anlatmak istediği şey **yeni bir davranış ya da özellik eklemek istediğimiz durumda; yapmak istediğimiz değişikliği mevcut koda dokunmadan, değişimi sadece yeni kodlar üzerinden sağlamaktır.**

![open-closed](./images/open-closed.png)

JAVA Kod Örneği:

```java
class Employee {
    ...
}

class EmployeeManager {
    public void addEmployee(Object database, Employee employee) {
        if (database instanceof OracleDatabase) {
            ((OracleDatabase) database).addDatabase(employee);
        }
    }
}

class OracleDatabase {
    public void addDatabase(Employee employee) {
        ...
    }
}
```

Yukarıdaki koda ve diyagrama baktığımız zaman `EmployeeManager` adında bir sınıfımız mevcut ve gelen `Employee` sınıfına ait nesneyi veri tabanına kayıt ediyor. Veri tabanına kayıt etmeden önce hangi veri tabanı örneği geldiğini de `if-else` durumlarında kotrol edip tip dönüşümü sağlamaktadır. Yukarıdaki kod örneği maalesef `Open-Closed` için uygun değildir. Nedeni ise yeni bir veri tabanı eklenmek istediğinde başka bir `if-else` durumu açılacaktır, yeni eklenen veri tabanı kontrolü sağlanacaktır ve sürekli mevcut koda bir müdahalede bulunulacaktır. **Bunu çözmenin yolu ise genelde soyutlamadan geçmektedir.**

Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir. Yeni bir eklemede mevcut koda dokunmaya gerek kalmıyor bu sayede. Kayıt işlemlerini `MySQL` üzerinde yapmak istediğimiz zaman `MySQLDatabase` adında bir sınıf oluşturup `IDatabase` arayüzünü uygulamamız yeterlidir. 🥰

![open-closed-2](./images/open-closed-2.png)

JAVA Kod Örneği:

```java
class Employee { 
...
}

interface IDatabase {
    void addDatabase(Employee employee);
}

class EmployeeManager {
    public void addEmployee(IDatabase database, Employee employee) {
        database.addDatabase(employee);
    }
}

class OracleDatabase implements IDatabase {
    @Override
    public void addDatabase(Employee employee) {
       ...
    }
}
```

### Liskov Substitution Principle (Liskov’un Yerine geçme Prensibi)

> Alt sınıflardan oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiklerinde aynı davranışı sergilemesi gerekmektedir.


Alt sınıflar, üst sınıflardan türediği için onların davranışlarını devralırlar. Eğer üst sınflara ait davranışları gerçekleştirmiyorlarsa davranışı yapan metotu muhtemelen boş bırakır ya da bir hata fırlatırız fakat bu işlemler kod kirliliğine ve gereksiz kod kalabalığına neden olmaktadır. Bunların yanı sıra projeye daha sonradan dahil olacak geliştiriciler için de sorun oluşturmaktadır. Geliştirici, sistemin sağlıklı yürüdüğünü düşünerek gerçekleştirilmeyen bir davranışı kullanmaya çalışabilir.


====> BURAYA ÖRNEK GELECEK <======



### Interface Segregation Principle (Arayüz Ayrımı Prensibi)

> Sınıflar, kullanmadığı metotları içeren arayüzleri uygulamaya zorlanmamalıdır. 



Arayüzlerimizde genel olarak birçok operasyonel işlem barındırabiliriz fakat bu arayüzü uygulayan sınıfların, bazılarını kullanmama durumu olabilmektedir. **Bir sınıf birden fazla arayüzü uygulaması özelliğiyle de birlikte bu prensip, bu tür durumlarda arayüzlerin ayrılmasını ve ihtiyaç halinde olanların kullanmasını söylemektedir**. 



![interface-segre](./images/interface-segre.png)

JAVA Kod Örneği:

```java
interface IWorker {
    void eat() throws Exception;

    void work();

    void pay() throws Exception;
}

class RobotWorker implements IWorker {

    @Override
    public void eat() throws Exception {
        throw new Exception();
    }

    @Override
    public void pay() throws Exception {
        throw new Exception();
    }

    @Override
    public void work() {
      ...
    }
}
```

Yukarıdaki diyagram incelendiğinde, şirket çalışanları `IWorker` arayüzünü uygulamaktadır; yemek yeme, ödeme alma, çalışma gibi davranışları gerçekleştirmektedir. Fakat daha sonradan bazı işler robotlar tarafından yapılmaya başlandı ya da dış kaynaktan birileri(outsource) de çalışmaya başladı. Bu durumda bazı davranışlar gerçekleşmeyecektir. Örneğin robotların yemek yeme ya da ödeme alma davranışını gerçekleştirememesi gibi ya da dış kaynaktan gelenlere verilmeyen yemek imkanı. Bu gerçekleşmeyen davranışların içlerini ya boş bırakma ya da hata fırlatma durumunda kalırız. **Bu tür durumlarda bu prensip bizlere bu arayüzlerin ayrılmasını ve ihtiyaç halinde olanların kullanılmasını söylemektedir.**



Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir. `work()`, `pay()`, `eat()` davranışları başka arayüzlere aktarıldı ve ihtiyaç halinde olanlar uygulandı.



![interface-segre-2](./images/interface-segre-2.png)



JAVA Kod Örneği:

```java
interface IWorker {
    void work();
}

interface IEatableWorker {
    void eat();
}

interface IPayableWorker {
    void pay();
}

class Worker implements IWorker, IEatableWorker, IPayableWorker {

    @Override
    public void eat() {
        ...
    }

    @Override
    public void work() {
        ...
    }

    @Override
    public void pay() {
        ...
    }
}

class RobotWorker implements IWorker {
    @Override

    public void work() {
     ...
    }
}
```



### Dependency Inversion Principle (Bağımlılıkların Tersine Çevrilmesi Prensibi)

> Yüksek seviye sınıflar, düşük seviye sınıflara bağlı olmamalıdır. Her ikisi de soyutlamalara bağlı olmalıdır.
> 
> Soyutlamalar, detaylara bağlı olmamalıdır.  Detaylar, soyutlamalara bağlı olmalıdır.



![dependency-inv](./images/dependency-inv.png)



JAVA Kod Örneği:

```java
class ExceptionReporter {
    private OracleDatabase oracleDatabase;

    public ExceptionReporter() {
        oracleDatabase = new OracleDatabase();
    }

    public void reportException(Exception exception) {
        oracleDatabase.add(exception);
    }
}

class OracleDatabase {
    public void add(Object object) {
        System.out.println("added :D");
    }
}
```

Yukarıdaki diyagram ve kod incelendiğinde `ExceptionReporter`  sınıfının (yüksek seviyeli sınıf), `OracleDatabase` sınıfına (düşük seviyeli sınıf) direkt olarak bağımlı olduğu görülmektedir. İleride veri tabanı olarak Oracle değil de MySQL kullanmak istersek maalesef bu sınıfa müdahale etmek zorunda kalacağız. Bu istenmeyen bir davranıştır. Bunun çözümünü ise buradaki **bağımlılıkları soyutlayarak** sağlayacağız.



Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir.



![dependency-inv-2](./images/dependency-inv-2.png)


```java
class ExceptionReporter {
    private IDatabase database;

    public ExceptionReporter(IDatabase database) {
        this.database = database;
    }

    public void reportException(Exception exception) {
        database.add(exception);
    }
}

interface IDatabase {
    void add(Object object);
}

class MySQLDatabase implements IDatabase {
    @Override
    public void add(Object object) {
        ...
    }
}

class OracleDatabase implements IDatabase {
    @Override

    public void add(Object object) {
        ...
    }
}
```



## Tasarım Deseni Nedir?

Tasarım desenleri; yazılım tasarımında, problemlerde karşımıza sıkça çıkan ortak sorunları çözmek için oluşturulmuş desenlerdir. Tasarım desenleri, yazılım sürecinde uygulanan çözümlerin esnekliği ve tekrar kullanılabilirliği ile de ilgilenmektedir.



*Her desen, çevremizde tekrar tekrar ortaya çıkan bir sorunu açıklar ve daha sonra bu soruna çözümün uygulanmasını, bu çözümü iki kez aynı şekilde yapmadan milyonlarca kez kullanabileceğiniz şekilde tanımlar.*

—Christopher Alexander


## Tasarım Desenleri

### Creational (Oluşturucu)

> Oluşturucu tasarım desenleri, bir nesnenin ya da grubun esnek ve tekrar kullanılabilir biçimde nasıl oluşturucağı ile ilgilenir.

- [Singleton]()
- [Factory]()
- [Abstract Factory]()
- [Builder]()
- [Prototype]()

#### 💎 Singleton

> Bir sınıfın sadece bir örneği olmalıdır ve bu örneğe global bir erişim noktası sağlanmalıdır.

![singleton-design-pattern](./images/singleton.png)

Desene ait yukarıdaki diyagrama bakacak olursak, örneğini istediğimiz sınıfın;

1. Constructor (oluşturucu metotu) `private `olmalıdır. Bunun amacı nesne oluşumunu tek yerden sağlamak. İstemcinin, `new` anahtar kelimesini kullanması engellemektir.
2. `Static bir değişken` olmalıdır, referansı tutmak için.
3. Tutulan referansa erişmek için bir metot olmalıdır, `getInstance()`

C# Kod Örneği:

```csharp
class Database
{
    private static Database database;

    private Database()
    {

    }

    public static Database GetInstance()
    {
        if (database == null)
        {
            database = new Database();
        }

        return database;
    }
}
```

```csharp
Database firstInstanceRequest = Database.GetInstance();
Database secondInstanceRequest = Database.GetInstance();

firstInstanceRequest == secondInstanceRequest // true
```

Desenin yukarıdaki durumu geçerli gibi duruyor fakat multi-thread uygulamalarda nesnenin daha örneğinin oluşmadığı esnada `if (database == null)` durumuna aynı anda birden fazla thread girebilir, bu sayede de o sınıfa ait birden fazla nesne örneği bulunur. Bu kısmı iyileştirme yolunda dillerin bize sağladığı yapıları kullanabiliriz. C# dilinde `lock` ile JAVA dili için de `synchronized` sayesinde aynı anda sadece bir yapının erişmesini sağlarız. 

C# dili için `GetInstance()` metotunu düzenleyecek olursak aşağıdaki hali alacaktır.

```csharp
public static Database GetInstance()
{
    if (database == null)
    {
        var lockObject = new object();

        lock (lockObject)
        {
            if (database == null)
            {
                database = new Database();
            }
        }
    }

    return database;
}
```

  *Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*



#### 🏭 Factory

> Factory tasarım deseni birbirleri ile ilişkili nesneleri oluşturmak için bir arayüz sağlar ve alt sınıfların hangi sınıfın örneğini oluşturacağına olanak sağlar. 



Buradaki amaç istemci tarafından birbirleri ile ilişkili nesnelerin oluşturulma anını soyutlamak, **istemci hangi sınıf örneğini alabileceğini bilebilir ama oluşturulma detayları bilmez**. Detaylar yani nesnenin nasıl oluşturulacağı soyutlanır. Örneğin oluşturulan sınıfın `Singleton` olarak oluşturulması gibi.

![factory-pattern](./images/factory-pattern.png)



C# Kod Örneği:

```csharp
public class User
{
    // Burada bildirimin gideceği kullanıcıya
    // ait bilgiler bulunacaktır.
}

// UML diyagramındaki IProduct arayüzümüze denk gelmektedir.
// İlişkili sınıflarımız bu arayüzü uygulayacaktır.
interface INotify
{
    void SendNotification(User user);
}

// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
class MailNotify : INotify
{
    public void SendNotification(User user)
    {
        // Mail gönderme operasyonu.
    }
}

// UML diyagramındaki ConcreteProduct sınıflarına denk gelmektedir.
public class SmsNotify : INotify
{
    public void SendNotification(User user)
    {
        // SMS gönderme operasyonu.
    }
}

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


*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*


#### 🏭🏭 Abstract Factory

> Abstract Factory tasarım deseni birbirleri ile ilişkili ürün ailesini oluşturmak için bir arayüz sağlar.



Factory tasarım deseninde bir ürünün oluşturulması soyutlanmış iken Abstract Factory deseninde birbirleri ile ilişkili ürün ailelerininin oluşturulması soyutlanmıştır. **Factory üreten Factory deseni olarak da düşünülebilir.** 🧐



Anlayacağımız; birden fazla ürün ailesi ile çalışmak zorunda kaldığımız durumlarda, istemciyi bu yapılardan soyutlamak için Abstract Factory doğru bir yaklaşım olacaktır.



![abstract-factory-uml](./images/abstract-factory-uml.png)

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

// Soyut sınıfımızdır.
// UML'deki Product sınıfına denk gelmektedir.
abstract class Connection
{
    public abstract bool OpenConnection();
    public abstract bool CloseConnection();
}

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

// Oluşturulacak ürünlere ait metotları içerir.
// UML'deki AbstractFactory sınıfına denk gelmektedir.
interface IDatabaseFactory
{
    Connection CreateConnection();
    Command CreateCommand();
}

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



*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*


#### ⛏️ Builder

> Builder deseni, karmaşık yapıdaki nesnelerin oluşturulmasında istemcinin sadece nesne tipini belirterek üretimi gerçekleştirebilmesini sağlamak için kullanılan bir desendir. Bu desende istemcinin kullanmak istediği gerçek ürünün birden fazla sunumunun olduğu durumlarda kullanılır.

Builder deseni birden fazla parçadan oluşan kompleks yapıdaki bir nesnenin oluşturulmasını ve bu kompleks nesnenin oluşturulma safhalarını istemci modülünden tamamen gizlemek için kullanılır. Kompleks nesnenin yaratılması istemci modülünden tamamen yalıtıldığı için nesnenin yaratılması ile ilgili işlemler farklı versiyonlarda tamamen değiştirilebilir. Bu durum, istemci programın çalışmasını hiç bir şekilde
etkilemeyecektir.

![builder-uml](./images/builder-uml.png)

                        *Bu diyagram refactoring.guru üzerinden alınmıştır*.


**Builder:** Product nesnesinin oluşturulması için gerekli soyut arayüzü sunar.

**ConcreteBuilder:** Product nesnesini oluşturur. Product ile ilişkili temel özellikleri de uygular.

**Director:** Builder arayüzünü kullanarak nesne örneklemesini yapar.

**Product:** Üretim sonucu ortaya çıkan nesneyi temsil eder. Dahili yapısı(örneğin temel özellikleri) ConcreteBuilder tarafından inşa edilir.



Senaryo olarak da online bir eğitim platformunun ilk defa eğitim alacak olan öğrencilere ilk eğitimini yarı fiyatına verdiği düşünülsün.



C# Kod Örneği:

```csharp
// UML diyagramındaki Product sınıfına denk gelmektedir.
// Farklı sunumları olan sınıfımız budur.
class Lesson
{
    public int id;
    public string name;
    public string price;
    public string discountedPrice;
    public bool discountApplied;
    public string lessonNote;
}
```

```csharp
// UML diyagramındaki Product'a denk gelen Lesson sınıfıa ait nesnenin oluşturulması için soyut arayüz sağlar.
// Yapılması gereken adımlar içerisinde tanımlıdır.
abstract class LessonBuilder
{
    public Lesson lesson;

    public abstract void GetLesson();
    public abstract void ApplyDiscount();
    public abstract void AddLessonNote();
    public abstract Lesson GetResult();
}
```

```csharp
// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class NewStudentLessonBuilder : LessonBuilder
{
    // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
    // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
    // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
    public override void GetLesson()
    {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    // Burada yeni öğrenciler için geçerli derste %50'lik bir indirim mevcut.
    public override void ApplyDiscount()
    {
        lesson.discountedPrice = lesson.price * 0.5;
        lesson.discountApplied = true;
    }

    public override void AddLessonNote()
    {
        lesson.lessonNote = "Hey, welcome. Your discount code has been applied!";
    }

    public override Lesson GetResult()
    {
        return lesson;
    }
}
```

```csharp
// LessonBuilder sınıfından türer ve orada tanımlı adımları gerçekleştirir.
// UML diyagramındaki ConcreteBuilder sınıfına denk gelmektedir.
class OldStudentLessonBuilder : LessonBuilder
{
    // Burada nesne çağırma işlemleri gerçekleştirilmektedir.
    // Nasıl çağrılacağı tamamen geliştiriciye kalmıştır.
    // Çıktıyı görmek amacıyla 1-2 değer ataması yapılacaktır.
    public override void GetLesson()
    {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    // Burada eski öğrenciler için geçerli derste herhangi bir indirim yapılmadı.
    public override void ApplyDiscount()
    {
        lesson.discountedPrice = lesson.price;
        lesson.discountApplied = false;
    }

    public override void AddLessonNote()
    {
        lesson.lessonNote = "";
    }

    public override Lesson GetResult()
    {
        return lesson;
    }
}
```

```csharp
// Builder arayüzünü kullanarak nesne örneklemesi yapar.
// UML diyagramındaki Director'a denk gelmektedir.
class LessonDirector
{
    private LessonBuilder lessonBuilder;

    public LessonDirector(LessonBuilder lessonBuilder)
    {
        this.lessonBuilder = lessonBuilder;
    }

    public void Make()
    {
        lessonBuilder.GetLesson();
        lessonBuilder.ApplyDiscount();
        lessonBuilder.AddLessonNote();
    }
}
```

```csharp
LessonBuilder lessonBuilder = new NewStudentLessonBuilder();

LessonDirector lessonDirector = new LessonDirector(lessonBuilder);
lessonDirector.Make();

Lesson lesson = lessonBuilder.GetResult();

Console.WriteLine($"{lesson.name} - {lesson.price} - {lesson.discountedPrice}");
// output: Artificial Intelligence -  Beginner to Advanced in 10 Minute. - 49,99 - 24,995
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*


#### 🐑 Prototype

> Prototype tasarım deseni, mevcut nesnelerin prototiplerinin oluşturulmasını yani nesnelerin kopyalarını elde etmeyi sağlayan bir tasarım desenidir.



Prototip deseninin tasarlanmasının asıl sebebi, ilgili nesne üzerinden aynı tipte başka bir nesneyi hızlıca üretebilmektir. Haliyle üretimi esnasında maliyetli olabilecek nesneleri(ki burada maliyetten kasıt parametreli constructer vs. olabilir) var olan nesne üzerinden `new` anahtar sözcüğünü kullanmadan bir şekilde oluşturulmasını sağlayabilmektedir.



`Shallow Copy` ve `Deep Copy` olmak üzere iki tür nesne kopyalama işlemi mevcuttur.

`Shallow Copy` ile nesnelerin bellekteki adresleri kopyalanmaktadır, dolayısıyla yüzeysel olarak bir kopyalama işlemi gerçekleştirileceği için yeni bir nesne üretilmemekte, var olan nesne üzerine referanslar ile işaretleme yapılmaktadır. Bundan dolayı **Shallow Copy, Prototype Design Pattern için uygun tercih olmayacaktır.**

`Deep Copy` ile nesneler birebir kopyalanabilmekte ve bu kopya sonucu ile asıl nesne farklı referanslar ile işaretlenebilmektedir. Prototype Design Pattern’de bu kopyalama yaklaşımında bulunmak en doğrusudur.



![prototype-uml](./images/prototype-uml.png)



JAVA Kod Örneği:

```java
// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
// Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
// Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
// Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
interface IClonablePrototype<TPrototype> extends Cloneable {
    TPrototype clone() throws CloneNotSupportedException;
}

// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız
// arayüzü uyguladık.
public class Employee implements IClonablePrototype<Employee> {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
```

```java
Employee gulizar = new Employee("Gülizar", "Yılmaz");

Employee cloneGulizar = gulizar.clone();


// Aynı nesne örneklerini farklı referanslarda tutuyor.
// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
System.out.println(gulizar == cloneGulizar); //output: false
```

---

C# Kod Örneği:

```csharp
// Klonlamak istediğimiz sınıflarımıza uygulayacağımız arayüz.
// Farklı sınıflarda da kullanılması için Generic bir yapı oluşturuldu.
// Generic yapı sayesinde dinamik olarak tip dönüşümü sağlanacaktır.
// Bu sayede farklı sınıflara da bu deseni uygulama şansı doğuyor.
interface IClonablePrototype<TPrototype>
{
    TPrototype Clone();
}

// Employee sınıfına klonlama yeteneği kazandırmak için tanımladığımız 
// arayüzü uyguladık.

class Employee : IClonablePrototype<Employee>
{
    string firstName;
    string lastName;

    public Employee(string firstName, string lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee Clone()
    {
        return base.MemberwiseClone() as Employee;
    }
}
```

```csharp
Employee gulizar = new Employee("Gülizar", "Yılmaz");
Employee cloneGulizar = gulizar.Clone();

// Aynı nesne örneklerini farklı referanslarda tutuyor.
// Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
Console.WriteLine(gulizar == cloneGulizar); //output: false
```

*Bu tasarım deseninin diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*

### Structural (Yapısal)

> Yapısal tasarım desenleri, nesnelerin birbirleriyle yapısal olarak nasıl birleşecekleri üzerine durur.

- [Adapter]()
- [Bridge]()
- [Composite]()
- [Decorator]()
- [Facade]()
- [Flyweight]()
- [Proxy]()

#### 🔌 Adapter

> Bir sınıfın arayüzünü istemcinin beklediği arayüze çevirmeye yarar.

Farklı sistemleri kendi sistemimize dahil ederken bazen yapılar uyuşmayabiliyor. Buradaki yapılar arayüzler olabilir. Bu desenin amacı arayüz için bir adapter oluşturarak sanki kendi sistemimize aitmiş gibi çalıştırmayı sağlar. Özetle; **uyumsuz bir yapıyı, istemcinin beklediği bir yapıya getirir.**

![adapter-uml](./images/adapter-uml.png)

- **Adaptee:** Mevcut sisteme uygulanmak istenen sınıf.

- **Adapter:** Mevcut sisteme uygulama işlemini yapan sınıf.

- **Target:** Sistemde kullanılan yapı. (Abstract, Interface vs.)

Geliştirdiğimiz uygulamada JSON işlemleri için sistemimizin `IJsonSerializer` arayüzünü kullandığını düşünelim. İlerleyen süreçte bu işlemleri gerçekleştirmek için 3. parti bir yazılım kullanmak istediniz  fakat daha sonradan eklediğiniz yapı sisteminiz ile uyumsuz çünkü sistem `IJsonSerializer` arayüzünü uyguluyor fakat yeni gelen yapı bunu uygulamamaktadır ve yeni gelen yapıya da müdahalede bulunamıyorsunuz. Bu sorunu adapter ile aşağıdaki gibi çözüme götürebiliriz.

C# Kod Örneği:

```csharp
// UML diyagramındaki Target'a denk gelmektedir.
// Sistem bu arayüzü uygulayarak çalışmaktadır.
interface IJsonSerializer
{
    public string SerializeObject(object obj);
}

// Sisteme daha sonradan dahil olan yapı.
// Sistemin kullandığı arayüzü uygulamamaktadır.
// UML diyagramındaki Adaptee'ye denk gelmektedir.
class CustomSerializer
{
    public string Serialize(object obj)
    {
        // Gelen nesneyi serilize etmek için temel operasyonel işlemler..
        // Daha sonradan da gerekli değerin geri döndürülmesi...
        return "serialized with CustomSerializer";

    }
}

// Daha sonradan dahil edilen yapının sisteme adepte edilmesi işlemi.
// Sistemin kullandığı arayüzü uygular.
// Bu sayede IJsonSerializer'i uygulayan bir sınıf örneği istendiğinde
// bu sınıf örneğini vererek mevcut koda dokunmadan sistemin devam etmesi
// sağlaır.
// UML diyagramındaki Adapter'a denk gelmektedir.
class CustomSerializerAdapter : IJsonSerializer
{
    public string SerializeObject(object obj)
    {
        CustomSerializer customSerializer = new CustomSerializer();
        return customSerializer.Serialize(obj);
    }
}
```

```csharp
class CustomOperation
{
    private IJsonSerializer _jsonSerializer;

    public CustomOperation(IJsonSerializer jsonSerializer)
    {
        _jsonSerializer = jsonSerializer;
    }

    public string SerializeObject(object obj)
    {
        return _jsonSerializer.SerializeObject(obj);
    }
}
```

```csharp
var customOperation = new CustomOperation(new CustomSerializerAdapter());

string serializedObject = customOperation.SerializeObject(new object());

Console.WriteLine(serializedObject); // output: serialized with CustomSerializer
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*

#### 🌉 Bridge

> Bridge tasarım deseni, soyutlanmış (abstract) yapıyı implementasyonundan (uygulamasından) ayırmaya, bağımsız olarak geliştirilebilir iki yapı elde etmemize yarar. 

İstemci kodunu, implementasyonundan ayırmak için soyutlamayı kullanır ve genel olarak da kalıtımdan yararlanmaktayız. Bu işlemleri gerçekleştirirken de bir arayüz veya soyut bir sınıf tanımlarız ve ondan miras hiyerarşileri yaratırız. Her ne kadar ilk bakışta bu yaklaşım mantıklı görünse de ve yanlış bir şey olmasa da, miras yoluyla soyutlamalar her zaman esnek değildir. Kalıtım kullandığımızda, uygulamayı kalıcı olarak soyutlamaya bağlarız. Sonuç olarak, birinde yapılan herhangi bir değişiklik diğerini etkiler. Buradaki daha esnek bir yol, soyutlamayı ve uygulamayı ayırmaktır ve bridge tasarım deseni bu noktada devreye girer. 

Senaryo olarak kullanıcıların metin veya e-posta mesajı gibi farklı türde mesajlar göndermek için kullanabileceği bir mesajlaşma uygulamasını düşünelim. Sezgisel olarak  `Mesaj` adında temel bir interface ya da abstract class oluşturmak ardından da sınıfları bunlardan türetmek gerekiyor. Türetilmiş sınıflarımız; `TextMessage`  ve `EmailMessage` olacaktır. Son olarak da e-posta ve metin mesajını gönderme senaryolarını yapacağımız için `TextMessage` sınıfından türeyen bir `TextMessageSender` ve `EmailMessage` sınıfından türeyen `EmailMessageSender`  sınıflarını oluştururduk. Oluşturacağımız yapı aşağıdaki gibi olacaktır.

![bridge-old](./images/bridge-old.png)

Yukarıdaki tasarımı baktığımız zaman  tasarımımız kalıtım üzerine kuruludur ve doğası gereği bir dezavantajı da kapsüllemeyi kırmasıdır.

Bunun yanı sıra `TextMessage` ya da `EmailMessage` gibi yapılarda oluşacak herhangi bir değişiklik `TextMessageSender` veya `EmailMessageSender` gibi sınıfları etkilemektedir. Birbirinden bağımsız yapılar değil.  



Tekrar kullanılabilirlik açısından da olumsuz bir yana sahiptir. Mesaj gönderme işlemlerini başka bir projede kullanmak istediğimizde bu işlemleri gerçekleştiren sınıfların türediği sınıfları da beraberinde götürmemiz gerekcektir.



Bridge tasarım deseni burada abstraction ve implementation kısmını ayırarak birbirinden bağımsız geliştirilebilir yapılar elde etmemizi sağlar.



Aşağıda Bridge tasarım desenine ait diyagram görülmektedir.

![bridge-without-imp-and-abst](./images/bridge-without-imp-and-abst.png)



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
Message emailMessage = new TextMessage(emailMessageSender);
emailMessage.Send(); // output: EmailMessageSender: Sending email message...
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*


#### 🌲 Composite

> Composite tasarım deseni, nesneleri ağaç yapısına göre düzenleyerek ağaç yapısındaki alt üst ilişkisini kurmaya yarayan bir desendir.

Bu tasarım deseninin amacının nesneleri ağaç yapısına göre düzenleyerek,
ağaç yapısındaki alt üst ilişkisini kurmak olduğunu söyledik. Burada ağacın herbir yapısı ortak bir arayüzü uygular. Ortak arayüzü uygulamasının sebebi ise birbirine benzer yapılar ile çalışıyor olmak bu benzerlik bizlere esnek bir yapı sunacaktır. 

Aşağıda bu desene ait UML diyagramı yer almaktadır.

![composite-uml](./images/composite-uml.png)

- **Client:** İstemci sınıf.

- **Component:** Soyut yapımızdır, özellikler içerisinde tanımlıdır ve diğer sınıflar bu yapıyı uygular.

- **Composite:** Alt öğeleri olan sınıfımızdır, `Component`'in somut halidir ve içerisinde Component listesi tutmaktadır.

- **Leaf:** Ağaç yapısındaki en alt elemanı temsil etmektedir.



Senaryo olarak iç içe geçmiş kategorileri ve kategorilerin en altında bulunan ürünleri düşünebiliriz. 



C# Kod Örneği:

```csharp
// Soyut yapımızdır.
// UML diyagramındaki Component kısmına denk gelmektedir.
// Diğer istemci sınıflar bu yapıyı uygular.
// Diğer sınıfların uygulayacağı hiyerarşiyi çizme metotunu içermektedir.
public interface ICatalogComponent
{
    void DrawHierarchy();
}
```

```csharp
// Somut yapımızdır.
// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (ICatalogComponent) listesi tutmaktadır.
public class ProductCatalog : ICatalogComponent
{
    private string _name;

    private List<ICatalogComponent> _components;

    public ProductCatalog(string name)
    {
        _name = name;
        _components = new List<ICatalogComponent>();
    }

    public void Add(ICatalogComponent catalogComponent)
    {
        _components.Add(catalogComponent);
    }

    public void Remove(ICatalogComponent catalogComponent)
    {
        _components.Remove(catalogComponent);
    }

    public void DrawHierarchy()
    {
        Console.WriteLine(_name);
        foreach (ICatalogComponent component in _components)
        {
            component.DrawHierarchy();
        }
    }
}
```

```csharp
// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
class Product : ICatalogComponent
{
    private string _name;

    public Product(string name)
    {
        _name = name;
    }

    public void DrawHierarchy()
    {
        Console.WriteLine(_name);
    }
}
```

```csharp
ProductCatalog items = new ProductCatalog("Ürünler");

ProductCatalog phones = new ProductCatalog("Telefonlar");

ProductCatalog iPhone = new ProductCatalog("iPhone Telefonlar");
ProductCatalog samsung = new ProductCatalog("Samsung Telefonlar");

Product iphone5Item = new Product("iPhone 5 Telefon");
Product samsungGalaxyItem = new Product("Samsung Galaxy Telefon");

// En üst hiyerarşiye telefon düğümü ekleniyor.
items.Add(phones);

// Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
phones.Add(iPhone);
phones.Add(samsung);

// iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
iPhone.Add(iphone5Item);

// Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
samsung.Add(samsungGalaxyItem);

items.DrawHierarchy();
// output:
//             -Ürünler
//             --Telefonlar
//             ---iPhone Telefonlar
//             ----iPhone 5 Telefon
//             --Samsung Telefonlar
//             ---Samsung Galaxy Telefon
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*




#### 📦 Facade

> Facade tasarım deseni, bir alt sistemdeki arayüzlere bir birleşik arayüz sağlayarak alt sistemin kullanımını daha kolay hale getirmeyi amaçlar.



Bu desendeki amaç karmaşık iş süreçlerini saklamaktır. Bunların yanı sıra algoritmalar, iş süreçleri vs. pek çok nesneden hizmet alarak ilerleyebilir. Bu detaylı bilgiler de bir nevi istemciden soyutlanmış olur.

Özetle: **amaç sistemi yeni bir bir alt yapıya sokmak değil, alt sınıflardaki karmaşıklığı soyutlayarak pratiklik sunmaktır.**



Senaryo olarak bir bankanın müşterilerine kredi kartı verdiklerini, bu kredi kartı verme işlemlerinden önce ise kendi iş kurallarını uyguladığını kabul edelim. Kodun kalabalık olmaması için temel olarak müşteriye kredi kartı vermeden önce kara listede olup olmadığı kontrol ediliyor olsun.

C# Kod Örneği:

```csharp
// Banka müşterimizi temsili oluşturan sınıf
class Customer
{
    public Customer(string firstName, string lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public string FirstName { get; set; }
    public string LastName { get; set; }
}
```

```csharp
// Kara liste ile ilgili işlemlerin yapıldığı sınıf
class BlackListService
{
    public bool CheckEmployeeIsTheBlackList(Customer customer)
    {
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        // Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        // Default olarak true döndürdük.
        return true;
    }
}
```

```csharp
// Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
class CreditCardManager
{
    public void CreateCreditCart(Customer customer)
    {
        // Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
    }
}
```

```csharp
// İstemci tarafından gerekli işlemlerin yapılması.
Customer duygu = new Customer("Duygu", "Kaya");

CreditCardManager creditCardManager = new CreditCardManager(); ;
BlackListService blackListService = new BlackListService();

if (blackListService.CheckEmployeeIsTheBlackList(duygu))
{
    creditCardManager.CreateCreditCart(duygu);
}
```

Yukarıdaki koda baktığımız zaman istemci tarafında önce müşterinin kara listede olup olmadığı kontrolü yapıldı daha sonra ise duruma göre kredi kartı oluşturması sağlandı. Buraya kadar pek de bir şey yok, çünkü bir adet kontrol var fakat tahmin edileceği üzere banka işlemlerinde birden fazla operasyonel işlem mevcut. Bu işlemlerin kalabalıklığından doğacak problemler arasında;

- Başka bir yerde kredi kartı oluşturulmak istendiğinde buradaki kodların aynısının oraya da yazılmasından kaynaklı kod kalabalığı olacaktır.
- İstemci tarafında bu işlemler gerçekleştiği için geliştiricinin bu doğrulama süreçlerini iyi ve eksiksiz takip etmesi gerekiyor olacak.
- Olası bir değişimde birden fazla yerde değişiklik yapması durumunda kalınacaktır.

Yukarıdaki temel nedenler olayın anlaşılması için yeterlidir.



Bu karmaşıklığın önüne geçmek için `Facade` tasarım deseni uygun bir çözümdür. Aşağıda bu desene ait UML diyagramı görülmektedir.

![facade-uml](./images/facade-uml.png)

Yukarıdaki UML diyagramından esinlenerek kredi kartı işlemlerindeki karmaşıklığı `CreditCardFacade` adında oluşturduğumuz sınıf içerisinde gizleyebiliriz. Kodumuz aşağıdaki gibi olacaktır.

C# Kod Örneği:

```csharp
// Banka müşterimizi temsili oluşturan sınıf.
class Customer
{
    public Customer(string firstName, string lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public string FirstName { get; set; }
    public string LastName { get; set; }
}
```

```csharp
// Kara liste ile ilgili işlemlerin yapıldığı sınıf
class BlackListService
{
    public bool CheckEmployeeIsTheBlackList(Customer customer)
    {
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        // Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        // Default olarak true döndürdük.
        return true;
    }
}
```

```csharp
//Kredi kartı ile ilgili işlemlerin yapıldığı sınıf
class CreditCardManager
{
    public void CreateCreditCart(Customer customer)
    {
        // Parametre olarak gelen kullanıcıya ait kredi kartı oluşturma işleminin yapıldığı yer
    }
}
```

```csharp
class CreditCardFacade
{
    public void CreateCreditCart(Customer customer)
    {
        CreditCardManager creditCardManager = new CreditCardManager(); ;
        BlackListService blackListService = new BlackListService();

        if (blackListService.CheckEmployeeIsTheBlackList(customer))
        {
            creditCardManager.CreateCreditCart(customer);
        }
    }
}
```

```csharp
Customer duygu = new Customer("Duygu", "Kaya");

CreditCardFacade creditCardFacade = new CreditCardFacade();
creditCardFacade.CreateCreditCart(duygu);
```

Bu sayede kod kalabalığının önüne geçilmiş olundu bunun da yanı sıra eklenecek yeni bir iş kuralında istemci tarafından herhangi bir değişikliğe gidilmemesi olumlu bir artı olarak geliyor.



*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*



### Behavioral (Davranışsal)

> Davranışsal tasarım desenleri, nesneler arası ortak haberleşmeyi efektif ve esnek bir yapıya getirmemizi  sağlar.


- [Chain of Responsibility]()
- [Command]()
- [Iterator]()
- [Mediator]()
- [Memento]()
- [Observer]()
- [State]()
- [Strategy]()
- [Template Method]()
- [Visitor]()

#### ⛓️ Chain of Responsibility

> Chain of Responsibility tasarım deseni, bir amaca yönelik bir dizi işlemi gerçekleştiren nesnelerin birbirinden bağımsız bir şekilde çalışmasını ve herbir nesnenin sadece kendisiyle tanımlı işleri yapmasını sağlayan bir tasarım desenidir.

Geliştirdiğimiz uygulamada gelen görselleri PNG formatına çevirdiğimiz var sayılsın.

C# Kod Örneği:

```csharp
// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image
{
    public string name;
    public string extension;

    public Image(string name, string extension)
    {
        this.name = name;
        this.extension = extension;
    }
}
```

```csharp
Image image = new Image("tatil-fotografim", "JPEG");

if (image.extension == "JPG")
{
    // JPG işlemine ait dönüştürme kodları işlemleri.
}
else if (image.extension == "JPEG")
{
    // JPEG işlemine ait dönüştürme kodları işlemleri.
}
else
{
    // Diğer türlere ait dönüştürme işlemleri.
}
```

Yukarıdaki koda bakıldığı zaman if-else içerisinde bir yığın görünmektedir. Herbir if bloğu kendi başına bir işlem. Yeni bir uzantı geldiğinde tekrardan bir blok açmamız gerekecektir, bunların yanı sıra bu kodu başka bir yerde de kullanılmak istendiğinde iyice kod kalabalığına da sebep olacaktır. Bu tasarım deseni, bizlere sorumlulukları ayrı bir sınıfa ayırmamızı ve birbirlerine gevşek bağlı olacak şekilde bağlamamızı söylüyor. Aşağıda bu desene ait UML diyagramı mevcuttur. Kodu UML diyagramına bakarak aşağıdaki gibi düzenleyebiliriz.

![chain-of-responsibility](./images/chain-of-responsibility.png)

C# Kod Örneği:

```csharp
// Uygulama süresince resimlerimizi temsil edecek sınıf.
class Image
{
    public string name;
    public string extension;

    public Image(string name, string extension)
    {
        this.name = name;
        this.extension = extension;
    }
}
```

```csharp
// Zincirin bir sonraki halkasının referansının tutulduğu sınıftır.

// İşlemi gerçekleştirecek olan metot tanımı bulunur.
// UML diyagramındaki BaseHandler sınıfına denk gelmektedir.
abstract class BaseHandler
{
    protected BaseHandler _nextHandler;
    public void SetNextHandler(BaseHandler nextHandler)
    {
        _nextHandler = nextHandler;
    }

    public abstract void HandleRequest(Image image);
}

// JPEG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPEGHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "JPEG")
        {
            Console.WriteLine("JPEG to PNG");
            // JPEG işlemine ait dönüştürme kodları işlemleri.
        }
        else
        {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            _nextHandler.HandleRequest(image);
        }
    }
}

// JPG dosyalarını dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class JPGHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "JPG")
        {
            Console.WriteLine("JPG to PNG");
            // JPG işlemine ait dönüştürme kodları işlemleri.
        }
        else
        {
            // Bu sınıfa ait bir işlem değilse zincirin bir sonraki halkasına aktarılır.
            _nextHandler.HandleRequest(image);
        }
    }
}

// Herhangi bir tipteki dosyayı dönüştüren sınıf.
// UML diyagramındaki ConcreteHandler sınıfına denk gelmektedir.
class CustomHandler : BaseHandler
{
    public override void HandleRequest(Image image)
    {
        if (image.extension == "OtherExtension")
        {
            Console.WriteLine("OtherExtension to PNG");
            // Herhangi bir tipteki dosyanın işlemine ait dönüştürme kodları işlemleri.
        }
        // Burada else ifadesi bulunmamaktadır bu da zincirin son halkası olduğu anlamına gelir.
    }
}
```

```csharp
Image image = new Image("tatil-fotografim", "JPG");

JPEGHandler jpegHandler = new JPEGHandler();
JPGHandler jpgHandler = new JPGHandler();
CustomHandler customHandler = new CustomHandler();

// Zincirlerin birbirleri ile bağlantısının yapıldığı yerdir.
// JPEG bu işlemi gerçekleştiremezse JPG'e aktarır o da Custom'a aktarır.
jpegHandler.SetNextHandler(jpgHandler);
jpgHandler.SetNextHandler(customHandler);

jpegHandler.HandleRequest(image); // output: JPG to PNG
```

Bu tasarım desenini bu probleme uyarlayarak;

- Tekrar kullanılabilir kod elde ettik.
- Bağımlılıkları gevşek hale getirdik.
- Zincirin halkası istemci tarafından değiştirilebilir bu sayede de genişletilebilir bir yapı elde edildi.

gibi faydaları görebilmekteyiz.

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*

#### 💪 Strategy

> Strategy tasarım deseni, bir algoritma ailesi tanımlamamızı, her birini ayrı bir sınıfa koymamızı ve nesnelerinin birbiriyle değiştirilebilir hale getirmenizi sağlayan davranışsal bir tasarım modelidir.

Bir işlemin birden fazla yapılması, çalışma zamanında algoritma değişikliği gibi durumlarda kullanılır, karışık if-else durumundan da kurtarır. Soyutlamadan dolayı da `Loosely Coupled` bir uygulama halini alır.



![stragety-uml](./images/stragety-uml.png)

Senaryo olarak e-ticaret projesinin ödeme kısmını düşünelim. Ödeme metotları arasında; kredi kartı, Paypal gibi seçenekler mevcuttur. 



C# Kod Örneği:

```csharp
// UML diyagramındaki Strategy arayüzüne denk gelmektedir.
// Benzer işlemleri yapan sınıflar bu arayüzden türeyecektir.
interface IPayment
{
    void Pay(int amount);
}

// UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class PaypalPayment : IPayment
{
    private string _email;
    private string _password;

    public PaypalPayment(string email, string password)
    {
        _email = email;
        _password = password;
    }

    public void Pay(int amount)
    {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        Console.WriteLine("Paid by Paypal.");
    }
}

// UML diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class CreditCartPayment : IPayment
{
    private string _name;
    private string _cardNumber;
    private string _cvv;
    private string _dateOfExpiry;

    public CreditCartPayment(string name, string ccNum, string cvv, string expiryDate)

    {
        _name = name;
        _cardNumber = ccNum;
        _cvv = cvv;
        _dateOfExpiry = expiryDate;
    }

    public void Pay(int amount)
    {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        Console.WriteLine("Paid by credit cart.");
    }
}
```

```csharp
// Sepette bulunan ürünleri temsil eden sınıf.
// Ürün kodu ve fiyat bilgisi temel olarak yeterlidir.
class Item
{
    private string _upcCode;
    private int _price;

    public Item(string upcCode, int price)
    {
        _upcCode = upcCode;
        _price = price;
    }

    public int GetPrice()
    {
        return _price;
    }
}
```

```csharp
// UML diyagramındaki Context sınıfına denk gelmektedir.
// UML diyagramındaki Strategy(IPayment) arayüzüne ait referansı tutmaktadır.
class ShoppingCart
{
    private List<Item> _items;
    private IPayment _payment;

    public ShoppingCart()
    {
        _items = new List<Item>();
    }

    public void SetPaymentMethod(IPayment payment)
    {
        _payment = payment;
    }

    public void AddItem(Item item)
    {
        _items.Add(item);
    }

    public int CalculateTotal()
    {
        int sum = 0;
        foreach (Item item in _items)
        {
            sum += item.GetPrice();
        }
        return sum;
    }

    public void Pay()
    {
        int amount = CalculateTotal();
        _payment.Pay(amount);
    }
}
```

```csharp
ShoppingCart shoppingCart = new ShoppingCart();
shoppingCart.AddItem(new Item("894651364", 80));
shoppingCart.AddItem(new Item("654798243", 20));

shoppingCart.SetPaymentMethod(new PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"));
shoppingCart.Pay(); // output: Paid by Paypal.


shoppingCart.SetPaymentMethod(new CreditCartPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"));
shoppingCart.Pay(); // output: Paid by credit cart.
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını bu tasarım deseni için oluşturulmuş klasörde bulabilirsiniz.*



# Kaynakçalar

- [https://tr.wikipedia.org/wiki/Nesne_y%C3%B6nelimli_programlama](https://tr.wikipedia.org/wiki/Nesne_y%C3%B6nelimli_programlama)
- [https://tr.wikipedia.org/wiki/%C3%87ok_bi%C3%A7imlilik](https://tr.wikipedia.org/wiki/%C3%87ok_bi%C3%A7imlilik)
- [https://tr.wikipedia.org/wiki/Kaps%C3%BClleme](https://tr.wikipedia.org/wiki/Kaps%C3%BClleme)
- [https://medium.com/@atarikguney/abstraction-ve-encapsulation-tam-olarak-nedir-27b9aae99e56](https://medium.com/@atarikguney/abstraction-ve-encapsulation-tam-olarak-nedir-27b9aae99e56)
- [Engin Demiroğ, Canlı Yayın - SOLID Yazılım Geliştirme Prensipleri](https://www.youtube.com/watch?v=JldZhDSvBBQ)
- [https://www.gencayyildiz.com/blog/c-abstract-factory-design-patternabstract-factory-tasarim-deseni/](https://www.gencayyildiz.com/blog/c-abstract-factory-design-patternabstract-factory-tasarim-deseni/)
- [https://www.gencayyildiz.com/blog/c-prototype-design-pattern-prototip-tasarim-deseni/](https://www.gencayyildiz.com/blog/c-prototype-design-pattern-prototip-tasarim-deseni/)
- [https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial](https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial)
- [https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/](https://springframework.guru/gang-of-four-design-patterns/bridge-pattern/)
