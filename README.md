![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/tasarim-desenleri-turkce-kaynak-2.png)

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
     - [Association (Bağlantı)]()
     - [Dependency (Bağımlılık)]()
     - [Composition(Bileşim)]()
     - [Aggregation(İçerme)]()
3. [Tasarım Deseni Nedir?]()
4. [S.O.L.I.D Nedir?]()
   - [Single Responsibility]()
   - [Open/Closed]()
   - [Liskov Substitution]()
   - [Interface Segregation]()
   - [Dependency Inversion]()
5. [Tasarım Desenleri]()
   - [Creational  (Oluşturucu)]()
   - [Structural (Yapısal)]()
   - [Behavioral (Davranışsal)]()
6. [Kapanış]()
7. [Kaynakçalar]()

## Giriş ve Tanışma

Merhabalar.👋

Ben Yusuf, K.T.Ü yazılım mühendisliği öğrencisiyim. Oluşturduğum bu kaynak ile; tasarım desenlerini bilmeyen kişiler için öğrenmeyi, bilgisi olan kişiler için de bilgilerini güncel tutacağı ve bir problem olduğunda danışacağı bir başucu kaynağı olmasını hedefliyorum. Bu kaynağın ortaya çıkış amacından da kısaca bahsedecek olursam; çevremdeki insanların, takip ettiğim kişilerin Türkçe kaynak oluşturma konusunda bir çaba içerisinde olduğunu fark ettim. Kimileri blog, haftalık okumalar, bültenler ya da kitap yazarak kimileri de eğitim videoları çekerek. Ben de bu zincire katılarak elimden geldiğince faydalı olmaya çalışmak istedim ve bu kaynağı oluşturmaya karar verdim.

## Nesne Yönelimli Programlama Nedir?

> Nesne yönelimli programlama kısmı temel hatırlatma olduğu için verilen diyagramlar, örnekler basit görünebilir. Bu kaynakta ana değinmemiz gereken yerler tasarım desenleri ve S.O.L.I.D prensipleridir, bu kısım hatırlatma niteliğindedir.

Nesne yönelimli programlama paradigması, gerçek hayatta olan varlıkları yazılım dünyasında modellemekte kullandığımız, her işlevin nesneler olarak soyutlandığı bir programalama yaklaşımıdır. Tıpkı gerçek hayatta olduğu gibi yazılımda da bu sayede nesnelerimizin öznitelikleri, davranışları olacaktır.

Ortaya çıkış nedenlerinden bazıları da yazılımda; karmaşıklığı azaltmaya, bakım maliyetini düşürmeye, modülariteyi artırmaya, nesneler arası hiyerarşiyi kurmaya yaramasıdır.    

### Nesneler, Sınıflar

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/developer-uml.png)

Yukarıda `Developer` adında bir sınıf görülmektedir. <code>Sınıf</code> alanlar(fields) ve davranışlarımızın(methods) tanımlandığı yerdir. <code>Nesne</code> ise bu sınıftan bir örnek alınmış halidir.

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/developer-yusuf-halit.png)

Diyelim ki Yusuf adında bir geliştiriciniz var. Yusuf bir nesne, `Developer` sınıfının bir örneğidir. Her `Developer`'ın birçok standart özelliği vardır: isim, yaş, ağırlık vb. Bunlar sınıfın alanları, öznitelikleridir.

Tüm geliştiriciler de benzer şekilde davranırlar: uyurlar, yerler, kod yazarlar. Bunlar sınıfın davranışlarıdır. Toplu olarak yukarıda da bahsettiğimiz gibi alanlar ve davranışlar sınıflarının üyeleri olarak başvurulabilir.

Bir diğer geliştiriciniz Halit de  `Developer` sınıfının bir örneğidir. Yusuf ile aynı özelliklere sahiptir. Fark bu özelliklerin değerlerinde: isimleri farklı, yaş olarak daha büyük ve daha hafif.

Yani bir sınıf, o sınıfın somut örnekleri olan nesnelerin yapısını tanımlayan bir taslak gibidir.

### Sınıf Hiyerarşileri

Yukarıdaki örnekte bir adet sınıf kullanıldı ama gerçek uygulamalarda bildiğimiz gibi bir sınıftan daha fazlası mevcut. Bunlar arasında bir hiyerarşi, düzen mevcut. Tıpkı gerçek hayatta olduğu gibi.  Biyoloji bunun için en iyi örnektir. İnekler ve kargalar aynı atadan gelirler, bu yüzden inekler ve kargaların ortak noktaları mecvuttur, bunlar; isim, cinsiyet, ayak sayısı gibi nitelikilerdir. Kargalar beslenebilir, uyuyabilir ve ineklerin yaptığı yaptığı gibi koşabilir. Biyolojide de olduğu gibi; yazılımda da bir hiyerarşi kurabilir, ortak nitelikleri ve davranışları listeleyecek temel `Hayvan` sınıfını tanımlayabiliriz.    

Hiyerarşi düzeninde; genel, kapsayıcı sınıfa  <code>superclass</code> (üst sınıf). Bunlardan türeyen sınıflara da <code>subclasses</code> (alt sınıflar) denir. Bu hiyerarşi ile birlikte alt sınıflar, üst sınıfların özelliklerini ve davranışlarını almaktadır. 

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/cow-crow-uml.png)

Bahsettiğimiz hiyerarşi yukarıda da gösterilmiştir. <code>Animal</code> adında bir <code>superclass</code> (üst sınıf) ve bulardan türeyen <code>subclasses</code> (alt sınıflar) mevcut. Bu alt sınıflar, üst sınıfın niteliklerini ve davranışlarını almaktadır. Bu yüzden kendi içlerinde tekrar yazmaya gerek yoktur. Ortak özeliklerin yanı sıra kendilerine has olan özellikler de kendi içlerinde tanımlanmıştır. Örneğin; `Cow` sınıfı içerisinde ineklere özgü olan süt sağma eylemi `milking()` fonksiyonu içerisinde gerçekleştirilmiştir. `Crow` sınıfına özel nitelikler ve davranışlar da kendi içerisinde tanımlanmıştır.

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/organism-uml.png)

Bazı durumlarda UML diyagramlarında sınıfların barındırdığı nitelik ve davranışlardan ziyade bulunduğu hiyerarşi daha önemlidir, bu tür durumlarda yukarıdaki gibi basit bir tanımlama kullanılmaktadır.

### Nesne Yönelimli Programlama İlkeleri

Nesne yönelimli programalama 4 temel ilke üzerine kuruludur ve bir dilin, nesne yönelimli programlamayı uyguluyor denmesi için 4 koşulu da sağlıyor olması gerekiyor. Bunlar; `Encapsulation`, `Abstraction`,  `Inheritance`, `Polymorphism`

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/oop-pillars.png)

#### Encapsulation (Kapsülleme)

Herhangi bir nesnenin metotlarını, verilerini veya değişkenlerini diğer nesnelerden saklayarak ve bunlara erişimini sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir. Bir nesne üzerinde hem veri soyutlama hem de kontrol soyutlaması yapılıyor ise buna sarma adı verilir. Çoğu programlama dilleri kapsüllemeyi aşağıda sıraladığımız erişim belirteçleri ile desteklerler.

1. **public:** Erişimin her yerden yapılabileceği anlamı taşıyor.

2. **private:** Erişimin tanımlandığı sınıf içerisinden yapılabileceği anlamı taşıyor.

3. **protected:** Sadece tanımlandığı sınıfın içinden veya o sınıftan türetilmiş diğer sınıfların içinden erişilebilir.

#### Abstraction (Soyutlama)

Farklı kod parçalarının kompleks kısımlarını, sahip oldukları ortak davranışlar, amaçlar, karakteristik özellikler arkasında saklamak sayesinde daha anlaşılır ve kolay kullanılabilir kod yazmaktır abstraction.

#### Inheritance (Kalıtım)

Kalıtım, mevcut sınıfların üzerine yeni sınıflar oluşturma yeteneğidir. Bu sayede türetilen sınıf, türediği sınıfın özelliklerini devralır. Kalıtımın en büyük yararı kodun yeniden kullanılmasıdır. Mevcut sınıftan biraz farklı bir sınıf oluşturmak istiyorsak, kodu kopyalamamıza gerek yoktur. Bunun yerine, varolan sınıfı genişletir ve ekstra işlevselliği alt sınıfa koyarız.    

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/human-uml.png)

Çoğu programlama dilinde **yalnızca bir sınıftan türetme işlemi gerçekleştirilmektedir** ama birden fazla interface'den(ara birimden) türetilme işlemi de gerçekleştirilebilmektedir. 

#### Polymorphism (Çok Biçimlilik)

Bir nesnenin başka bir nesne gibi davranabilmesi, kullanılabilmesi. Biraz daha açık bir ifade ile: alt sınıfların, üst sınıflara ait olan davranışlarını başka bir biçimde gerçekleştiriyor olması olayıdır. 

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-poly-logger-service.png)    

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

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-inheritance.png)

Sınıflar arası kalıtımı gösterir.

#### Implementation

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-realization.png)

Arayüzler ile sınıflar arasındaki ilişkiyi gösterir.

#### Association (Bağlantı)

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-association.png)

Bir nesnenin başka bir nesneyi kullandığı veya onunla etkileşime girdiği bir ilişki türüdür. Kullanılmak istenen nesneye ok işareti ile refere edilir. **Sınıflar arasında HAS-A ilişkisi bulunuyor.** 

#### Dependency (Bağımlılık)

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-dependency.png)

Genellikle nesneler arasında kalıcı bir bağlantı olmadığını ima eden daha zayıf bir ilişki çeşididir. Bağımlılık genellikle (ancak her zaman değil), bir nesnenin başka bir nesneyi bir parametre olarak kabul ettiğini, başlattığını veya başka bir nesneyi kullandığını gösterir. Sınıflar arasındaki bağımlılığı nasıl tespit edebileceğiniz aşağıda açıklanmıştır: **Bir sınıfın tanımında yapılan değişiklikler başka bir sınıfta değişikliklere neden oluyorsa iki sınıf arasında bir bağımlılık vardır.**

#### Composition(Bileşim)

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-composition.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşımazlar**. Yukarıdaki örneğe bakılacağı zaman firma konumlardan oluşmaktadır, ayrılma durumu yoktur, bağımlıdır, konum tek başına bir anlam ifade etmez.

#### Aggregation(İçerme)

![ ](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/blob/master/images/uml-aggregation.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşıyabilirler**. Yukarıdaki örneğe bakılacağı zaman havalimanı uçakları içerir, ayrılma durumu olabilir, sıkı sıkıya bağımlılık yoktur, uçak tek başına bir anlam ifade edebilir.

# Kaynakçalar

- [https://tr.wikipedia.org/wiki/Nesne_y%C3%B6nelimli_programlama](https://tr.wikipedia.org/wiki/Nesne_y%C3%B6nelimli_programlama)
- [https://tr.wikipedia.org/wiki/%C3%87ok_bi%C3%A7imlilik](https://tr.wikipedia.org/wiki/%C3%87ok_bi%C3%A7imlilik)
- [https://tr.wikipedia.org/wiki/Kaps%C3%BClleme](https://tr.wikipedia.org/wiki/Kaps%C3%BClleme)
- [https://medium.com/@atarikguney/abstraction-ve-encapsulation-tam-olarak-nedir-27b9aae99e56](https://medium.com/@atarikguney/abstraction-ve-encapsulation-tam-olarak-nedir-27b9aae99e56)
- 
