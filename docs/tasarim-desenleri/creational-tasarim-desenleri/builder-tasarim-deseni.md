> Builder deseni, karmaşık yapıdaki nesnelerin oluşturulmasında istemcinin sadece nesne tipini belirterek üretimi gerçekleştirebilmesini sağlamak için kullanılan bir desendir. Bu desende istemcinin kullanmak istediği gerçek ürünün birden fazla sunumunun olduğu durumlarda kullanılır.

Builder deseni birden fazla parçadan oluşan kompleks yapıdaki bir nesnenin oluşturulmasını ve bu kompleks nesnenin oluşturulma safhalarını istemci modülünden tamamen gizlemek için kullanılır. Kompleks nesnenin yaratılması istemci modülünden tamamen yalıtıldığı için nesnenin yaratılması ile ilgili işlemler farklı versiyonlarda tamamen değiştirilebilir. Bu durum, istemci programın çalışmasını hiç bir şekilde
etkilemeyecektir.

![builder-uml](../../../images/builder-uml.png)

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

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/builder) bulabilirsiniz.*