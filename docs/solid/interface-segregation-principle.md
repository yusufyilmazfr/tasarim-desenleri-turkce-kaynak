> Sınıflar, kullanmadığı metotları içeren arayüzleri uygulamaya zorlanmamalıdır. 

Arayüzlerimizde genel olarak birçok operasyonel işlem barındırabiliriz fakat bu arayüzü uygulayan sınıfların, bazılarını kullanmama durumu olabilmektedir. **Bir sınıf birden fazla arayüzü uygulaması özelliğiyle de birlikte bu prensip, bu tür durumlarda arayüzlerin ayrılmasını ve ihtiyaç halinde olanların kullanmasını söylemektedir**. 

![interface-segre](../../images/interface-segre.png)

JAVA Kod Örneği:

```java
interface IWorker {
    void eat() throws Exception;

    void work();

    void pay() throws Exception;
}
```

```java
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

Yukarıdaki diyagram incelendiğinde, şirket çalışanları `IWorker` arayüzünü uygulamaktadır; yemek yeme, ödeme alma, çalışma gibi davranışları gerçekleştirmektedir. Fakat daha sonradan bazı işler robotlar tarafından yapılmaya başlandı ya da dış kaynaktan birileri (outsource) de çalışmaya başladı. Bu durumda bazı davranışlar gerçekleşmeyecektir. Örneğin robotların yemek yeme ya da ödeme alma davranışını gerçekleştirememesi gibi ya da dış kaynaktan gelenlere verilmeyen yemek imkanı. Bu gerçekleşmeyen davranışların içlerini ya boş bırakma ya da hata fırlatma durumunda kalırız. **Bu tür durumlarda bu prensip bizlere bu arayüzlerin ayrılmasını ve ihtiyaç halinde olanların kullanılmasını söylemektedir.**

Yukarıdaki UML diyagramını biraz daha düzenlersek aşağıdaki gibi bir yapı elde edilir. `work()`, `pay()`, `eat()` davranışları başka arayüzlere aktarıldı ve ihtiyaç halinde olanlar uygulandı.

![interface-segre-2](../../images/interface-segre-2.png)

JAVA Kod Örneği:

```java
interface IWorker {
    void work();
}
```

```java
interface IEatableWorker {
    void eat();
}
```

```java
interface IPayableWorker {
    void pay();
}
```

```java
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
```

```java
class RobotWorker implements IWorker {
    @Override

    public void work() {
     ...
    }
}
```