> Iterator tasarım deseni, koleksiyon üzerindeki elemanların üzerinde dolaşmak için kullanılan tasarım desenidir.

Uygulamalarımızı geliştirirken verilerimizi bir yerlerde tutma gereği duyarız. Burada birçok seçenek vardır. Ağaç, liste, kuyruk, yığın gibi. Liste gibi yapılarda dolaşmak, verileri elde etmek kolaydır fakat iş kompleks yapılara doğru gittiğinde veri üzerinde dolanmak biraz daha zorlaşabiliyor. 

![tree traversal](../../../images/tree%20traversal.png)

Örneğin; Ağaç yapısını kullandığınızı ve veri üzerinde dolanma işlemleri için **inorder** seçeneğini seçtiniz. Fakat başka bir zaman mecburi bir değişiklikten sonra arama yönteminizi **postorder** olarak değiştirdiniz. Burada sürekli bir değişim mevcuttur. Bunları soyutlamak, değişikliğe adapte olmak gibi bir çok işlemleri Iterator tasarım deseni ile gerçekleştirilebilmektedir.

Iterator tasarım deseninin en önemli özelliği gezdiği koleksiyonun ne olduğunu bilmemesidir yani iterasyon işlemlerini gerçekleştirmek üzere kurguludur. Böylece kullandığı veri yapısının ve çalışma tarzının uygulamanın diğer kısımları ile olan bağlantılarını en aza indirilir. Bu iterasyon işlemlerinin gerçekleştiği yapı; liste, ağaç, kuyruk vs. olabilir. 

Bu tasarım desenine ait UML diyagramı aşağıdaki gibidir.

![iterator-uml](../../../images/iterator-uml.png)

- **Iterator:** Koleksiyon üzerinde dolaşmak, nesneleri elde edebilmek için gerekli operasyonların tanımlandığı arayüzdür. Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.

- **ConcreteIterator:** `Iterator` arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular. Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.

- **Aggregate:** `Iterator` arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir. Bu sayede birden fazla `Iterator` arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.

- **ConcreteAggregate:** `Aggregate` arayüzünü uygular ve `Iterator` arayüzünü uygulayan sınıf örneği üretir.

Senaryo olarak elimizde bir çalışan listesi olduğu ve bu liste üzerinde işlemler yapıldığı varsayılsın.

C# Kod Örneği:

```csharp
// Liste üzerinde gezilecek olan elamnı temsil eden sınıf.
class Employee
{
    public int id;
    public string firstName;
    public string lastName;

    public Employee(int id, string firstName, string lastName)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
```

```csharp
// Koleksiyon üzerinde dolaşmak için operasyonların tanımlandığı arayüzdür.
// Bir sonraki elemana geçme, bir sonraki elemanın olup olmadığı gibi.
// UML diyagramındaki Iterator arayüzüne denk gelmektedir.
// Generic bir yapı sağlanarak birçok yerde kullanılması sağlanır.
interface IIterator<T>
{
    bool HasNext();
    T GetCurrentItem();
}
```

```csharp
// Iterator arayüzünü uygulayan sınıf örneklerini elde etmek için metot içerir.
// Bu sayede çeşitli Iterator arayüzünü uygulayan sınıfların örneklerini elde edebiliriz.
// UML diyagramındaki Aggregate arayüzüne denk gelmektedir.
interface IEmployeeAggregate
{
    IIterator<Employee> CreateIterator();
}
```

```csharp
// Aggregate (IEmployeeAggregate) arayüzünü uygular ve Iterator arayüzünü uygulayan sınıf örneği üretir.
// Değerlerin referansları burada bulunur.
// UML diyagramındaki ConcreteAggregate  sınıfına denk gelmektedir.
class EmployeeListAggregate : IEmployeeAggregate
{
    private List<Employee> _employees;

    public EmployeeListAggregate()
    {
        _employees = new List<Employee>();
    }

    public void Add(Employee employee)
    {
        _employees.Add(employee);
    }

    public int Count()
    {
        return _employees.Count;
    }

    public Employee Get(int index)
    {
        return _employees[index];
    }

    public IIterator<Employee> CreateIterator()
    {
        return new EmployeeIterator(this);
    }
}
```

```csharp
// Iterator arayüzünü ve koleksiyon üzerinde dolaşmak için gerekli metotları uygular.
// Veriler üzerinde dolanma işlemleri burada gerçekleştirilecektir.
// ConcreteAggregate (EmployeeListAggregate) sınıfı ile birlikte çalışır
class EmployeeIterator : IIterator<Employee>
{
    private EmployeeListAggregate _employeeListAggregate;
    private int _currentIndex;

    public EmployeeIterator(EmployeeListAggregate employeeListAggregate)
    {
        _employeeListAggregate = employeeListAggregate;
        _currentIndex = 0;
    }

    public Employee GetCurrentItem()
    {
        return _employeeListAggregate.Get(_currentIndex++);
    }

    public bool HasNext()
    {
        if (_employeeListAggregate.Count() > _currentIndex)
        {
            return true;
        }
        return false;
    }
}
```

```csharp
EmployeeListAggregate employeeListAggregate = new EmployeeListAggregate();

Employee yusuf = new Employee(1, "Yusuf", "Yılmaz");
Employee arafat = new Employee(2, "Arafat", "Önlük");
Employee derya = new Employee(3, "Derya", "Obi");

employeeListAggregate.Add(yusuf);
employeeListAggregate.Add(arafat);
employeeListAggregate.Add(derya);

var iterator = employeeListAggregate.CreateIterator();

while (iterator.HasNext())
{
    Employee currentEmployee = iterator.GetCurrentItem();
    Console.WriteLine($"{currentEmployee.firstName} {currentEmployee.lastName}");
}

// output:
//  Yusuf Yılmaz
//  Arafat Önlük
//  Derya Obi
```

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/iterator) bulabilirsiniz.*