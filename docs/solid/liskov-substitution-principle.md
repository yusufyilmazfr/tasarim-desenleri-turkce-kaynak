> Alt sınıflardan oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiklerinde aynı davranışı sergilemesi gerekmektedir.

Alt sınıflar, üst sınıflardan türediği için onların davranışlarını devralırlar. Eğer üst sınıflara ait davranışları gerçekleştirmiyorlarsa davranışı yapan metotu muhtemelen boş bırakır ya da bir hata fırlatırız fakat bu işlemler kod kirliliğine ve gereksiz kod kalabalığına neden olmaktadır. Bunların yanı sıra projeye daha sonradan dahil olacak geliştiriciler için de sorun oluşturmaktadır. Geliştirici, sistemin sağlıklı yürüdüğünü düşünerek gerçekleştirilmeyen bir davranışı kullanmaya çalışabilir.

![ ](../../images/liskov-1.png)

Java Kod Örneği:

```java
abstract class Logger {
    public abstract void openConnection();
    public abstract void closeConnection();
    public abstract void log();
}
```

```java
class DatabaseLogger extends Logger {
    @Override
    public void openConnection() {
        ...
    }

    @Override
    public void closeConnection() {
        ...
    }

    @Override
    public void log() {
        openConnection();
        // LOG
        closeConnection();
    }
}
```

yukarıdaki koda baktığımız zaman `DatabaseLogger` sınıfımız, `Logger` adlı sınıftan türemektedir. Başlangıç aşaması için bir problem görünmezken ilerleyen zamanlarda veri tabanı değil de bir dosyaya kayıt işlemi alınacağı zaman aşağıdaki gibi bir görünüm meydana gelecektir.

![ ](../../images/liskov-2.png)

```java
class FileLogger extends Logger {
    @Override
    public void openConnection() {
        new Exception("Not implemented!");
    }

    @Override
    public void closeConnection() {
        new Exception("Not implemented!");
    }

    @Override
    public void log() {
        // LOG
    }
}
```

bağlantı açma ve kapatma işlemleri veri tabanına aittir, bir dosyaya değil. Gereksiz hata fırlatmaları, kodun okunmasındaki zorluk, kod kalabalığı gibi birçok olaya neden olmaktadır. Burada bu işlemler bir ara sınıfa alınabilir.

![ ](../../images/liskov-3.png)

```java
abstract class Logger {
    public abstract void log();
}
```

```java
abstract class ConnectableLogger extends Logger {
    public abstract void openConnection();
    public abstract void closeConnection();
}
```

```java
class FileLogger extends Logger {
    @Override
    public void log() {
        // LOG
    }
}
```

```java
class DatabaseLogger extends ConnectableLogger {
    @Override
    public void openConnection() {
        ...
    }

    @Override
    public void closeConnection() {
        ...
    }

    @Override
    public void log() {
        openConnection();
        // LOG
        closeConnection();
    }
}
```