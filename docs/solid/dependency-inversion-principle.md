> Yüksek seviye sınıflar, düşük seviye sınıflara bağlı olmamalıdır. Her ikisi de soyutlamalara bağlı olmalıdır.
> 
> Soyutlamalar, detaylara bağlı olmamalıdır.  Detaylar, soyutlamalara bağlı olmalıdır.

![dependency-inv](../../images/dependency-inv.png)

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

![dependency-inv-2](../../images/dependency-inv-2.png)

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