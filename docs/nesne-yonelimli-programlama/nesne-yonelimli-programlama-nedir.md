# Nesne Yönelimli Programlama Nedir?

Nesne yönelimli programlama paradigması, gerçek hayatta olan varlıkları yazılım dünyasında modellemekte kullandığımız, her işlevin nesneler olarak soyutlandığı bir programlama yaklaşımıdır. Tıpkı gerçek hayatta olduğu gibi yazılımda da bu sayede nesnelerimizin öznitelikleri, davranışları olacaktır.

Ortaya çıkış nedenlerinden bazıları da yazılımda; karmaşıklığı azaltmaya, bakım maliyetini düşürmeye, modülariteyi artırmaya, nesneler arası hiyerarşiyi kurmaya yaramasıdır.

## Nesneler, Sınıflar

![developer-uml](../../images/developer-uml.png)

Yukarıda `Developer` adında bir sınıf görülmektedir. <code>Sınıf</code> alanlar (fields) ve davranışlarımızın (methods) tanımlandığı yerdir. <code>Nesne</code> ise bu sınıftan bir örnek alınmış halidir.

![developer-yusuf-halit](../../images/developer-yusuf-halit.png)

Diyelim ki Yusuf adında bir geliştiriciniz var. Yusuf bir nesne, `Developer` sınıfının bir örneğidir. Her `Developer`'ın birçok standart özelliği vardır: isim, yaş, ağırlık vb. Bunlar sınıfın alanları, öznitelikleridir.

Tüm geliştiriciler de benzer şekilde davranırlar: uyurlar, yerler, kod yazarlar. Bunlar sınıfın davranışlarıdır. Toplu olarak yukarıda da bahsettiğimiz gibi alanlar ve davranışlar sınıflarının üyeleri olarak başvurulabilir.

Bir diğer geliştiriciniz Halit de  `Developer` sınıfının bir örneğidir. Yusuf ile aynı özelliklere sahiptir. Fark bu özelliklerin değerlerinde: isimleri farklı, yaş olarak daha büyük ve daha hafif.

Yani bir sınıf, o sınıfın somut örnekleri olan nesnelerin yapısını tanımlayan bir taslak gibidir.

## Sınıf Hiyerarşileri

Yukarıdaki örnekte bir adet sınıf kullanıldı ama gerçek uygulamalarda bildiğimiz gibi bir sınıftan daha fazlası mevcut. Bunlar arasında bir hiyerarşi, düzen mevcut. Tıpkı gerçek hayatta olduğu gibi.  Biyoloji bunun için en iyi örnektir. İnekler ve kargalar aynı atadan gelirler, bu yüzden inekler ve kargaların ortak noktaları mevcuttur, bunlar; isim, cinsiyet, ayak sayısı gibi niteliklerdir. Kargalar beslenebilir, uyuyabilir ve ineklerin yaptığı gibi koşabilir. Biyolojide de olduğu gibi; yazılımda da bir hiyerarşi kurabilir, ortak nitelikleri ve davranışları listeleyecek temel `Hayvan` sınıfını tanımlayabiliriz.    

Hiyerarşi düzeninde; genel, kapsayıcı sınıfa  <code>superclass</code> (üst sınıf). Bunlardan türeyen sınıflara da <code>subclasses</code> (alt sınıflar) denir. Bu hiyerarşi ile birlikte alt sınıflar, üst sınıfların özelliklerini ve davranışlarını almaktadır. 

![cow-crow-uml](../../images/cow-crow-uml.png)

Bahsettiğimiz hiyerarşi yukarıda da gösterilmiştir. <code>Animal</code> adında bir <code>superclass</code> (üst sınıf) ve bunlardan türeyen <code>subclasses</code> (alt sınıflar) mevcut. Bu alt sınıflar, üst sınıfın niteliklerini ve davranışlarını almaktadır. Bu yüzden kendi içlerinde tekrar yazmaya gerek yoktur. Ortak özeliklerin yanı sıra kendilerine has olan özellikler de kendi içlerinde tanımlanmıştır. Örneğin; `Cow` sınıfı içerisinde ineklere özgü olan süt sağma eylemi `milking()` fonksiyonu içerisinde gerçekleştirilmiştir. `Crow` sınıfına özel nitelikler ve davranışlar da kendi içerisinde tanımlanmıştır.

![organism-uml](../../images/organism-uml.png)

Bazı durumlarda UML diyagramlarında sınıfların barındırdığı nitelik ve davranışlardan ziyade bulunduğu hiyerarşi daha önemlidir, bu tür durumlarda yukarıdaki gibi basit bir tanımlama kullanılmaktadır.
## Nesne Yönelimli Programlama İlkeleri
Nesne yönelimli programlama 4 temel ilke üzerine kuruludur ve bir dilin, nesne yönelimli programlamayı uyguluyor denebilmesi için 4 koşulu da sağlıyor olması gerekiyor. Bunlar; `Encapsulation`, `Abstraction`,  `Inheritance`, `Polymorphism`

![oop-pillars](../../images/oop-pillars.png)

### Abstraction
Farklı kod parçalarının kompleks kısımlarını, sahip oldukları ortak davranışlar, amaçlar, karakteristik özellikler arkasında saklamak sayesinde daha anlaşılır ve kolay kullanılabilir kod yazmaktır abstraction.
### Encapsulation
Herhangi bir nesnenin metotlarını, verilerini veya değişkenlerini diğer nesnelerden saklayarak ve bunlara erişimini sınırlandırarak yanlış kullanımlardan koruyan bir konsepttir. Bir nesne üzerinde hem veri soyutlama hem de kontrol soyutlaması yapılıyor ise buna sarma adı verilir. Çoğu programlama dilleri kapsüllemeyi aşağıda sıraladığımız erişim belirteçleri ile desteklerler.

1. **public:** Erişimin her yerden yapılabileceği anlamı taşıyor.

2. **private:** Erişimin tanımlandığı sınıf içerisinden yapılabileceği anlamı taşıyor.

3. **protected:** Sadece tanımlandığı sınıfın içinden veya o sınıftan türetilmiş diğer sınıfların içinden erişilebilir.
### Inheritance
Kalıtım, mevcut sınıfların üzerine yeni sınıflar oluşturma yeteneğidir. Bu sayede türetilen sınıf, türediği sınıfın özelliklerini devralır. Kalıtımın en büyük yararı kodun yeniden kullanılmasıdır. Mevcut sınıftan biraz farklı bir sınıf oluşturmak istiyorsak, kodu kopyalamamıza gerek yoktur. Bunun yerine, varolan sınıfı genişletir ve ekstra işlevselliği alt sınıfa koyarız.    

![human-uml](../../images/human-uml.png)

Çoğu programlama dilinde **yalnızca bir sınıftan türetme işlemi gerçekleştirilmektedir** ama birden fazla interface'den (ara birimden) türetilme işlemi de gerçekleştirilebilmektedir. 
### Polymorphism
Bir nesnenin başka bir nesne gibi davranabilmesi, kullanılabilmesi. Biraz daha açık bir ifade ile: alt sınıfların, üst sınıflara ait olan davranışlarını başka bir biçimde gerçekleştiriyor olması olayıdır. 

![uml-poly-logger-service](../../images/uml-poly-logger-service.png)    

Yukarıda `ILoggerService` adında bir `Interface` ve içerisinde de `log()` adında metotu bulunmaktadır.  Bu interface'den türetilen `DatabaseLoggerService` ve `FileLoggerService` sınıfları, metotu implement etmek (uygulamak) zorundadır ve kendince uygulayacaktır ki bundan dolayı da bu metota ait farklı davranışlar söz konusu olacaktır.

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
## Nesneler Arası İlişkiler
Bu kısımda kaynağın herkese hitap etmesi açısından temel düzeyde de olsa UML diyagramlarındaki sınıflar arasındaki ilişkilere değiniyor olacağız.
### Aggregation
![uml-aggregation](../../images/uml-aggregation.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşıyabilirler**. Yukarıdaki örneğe bakılacağı zaman havalimanı uçakları içerir, ayrılma durumu olabilir, sıkı sıkıya bağımlılık yoktur, uçak tek başına bir anlam ifade edebilir.
### Association
![uml-association](../../images/uml-association.png)

Bir nesnenin başka bir nesneyi kullandığı veya onunla etkileşime girdiği bir ilişki türüdür. Kullanılmak istenen nesneye ok işareti ile refere edilir. **Sınıflar arasında HAS-A ilişkisi bulunuyor.** 
### Composition
![uml-composition](../../images/uml-composition.png)

Bütünlük sağlar, bir sınıf veya sınıfların diğer bir sınıfın parçası olduğu anlamı çıkar. **Parçalar tek başlarına bir anlam taşımazlar**. Yukarıdaki örneğe bakılacağı zaman firma konumlardan oluşmaktadır, ayrılma durumu yoktur, bağımlıdır, konum tek başına bir anlam ifade etmez.
### Dependency
![uml-dependency](../../images/uml-dependency.png)

Genellikle nesneler arasında kalıcı bir bağlantı olmadığını ima eden daha zayıf bir ilişki çeşididir. Bağımlılık genellikle (ancak her zaman değil), bir nesnenin başka bir nesneyi bir parametre olarak kabul ettiğini, başlattığını veya başka bir nesneyi kullandığını gösterir. Sınıflar arasındaki bağımlılığı nasıl tespit edebileceğiniz aşağıda açıklanmıştır: **Bir sınıfın tanımında yapılan değişiklikler başka bir sınıfta değişikliklere neden oluyorsa iki sınıf arasında bir bağımlılık vardır.**
### Implementation
![uml-realization](../../images/uml-realization.png)

Arayüzler ile sınıflar arasındaki ilişkiyi gösterir.
### Inheritance
![uml-inheritance](../../images/uml-inheritance.png)

Sınıflar arası kalıtımı gösterir. Alt sınıftan üst sınıfa doğru içi boş ok ile gösterilir.