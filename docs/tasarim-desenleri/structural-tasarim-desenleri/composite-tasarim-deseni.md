> Composite tasarım deseni, nesneleri ağaç yapısına göre düzenleyerek ağaç yapısındaki alt üst ilişkisini kurmaya yarayan bir desendir.

Bu tasarım deseninin amacının nesneleri ağaç yapısına göre düzenleyerek,
ağaç yapısındaki alt üst ilişkisini kurmak olduğunu söyledik. Burada ağacın herbir yapısı ortak bir arayüzü uygular. Ortak arayüzü uygulamasının sebebi ise birbirine benzer yapılar ile çalışıyor olmak bu benzerlik bizlere esnek bir yapı sunacaktır. 

Aşağıda bu desene ait UML diyagramı yer almaktadır.

![composite-uml](../../../images/composite-uml.png)

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

*Bu tasarım deseninin JAVA ve diğer diller için olan uygulamasını [bu tasarım deseni için oluşturulmuş klasörde](https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak/tree/master/composite) bulabilirsiniz.*