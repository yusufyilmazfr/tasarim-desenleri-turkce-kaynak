from employee import Employee
from copy import deepcopy

if __name__ == '__main__':
    """
    Diger programlama dilleri deep copy ve shallow copy konusunda ayrıma gitmek icin tip bagimli
    olduklarindan ya kopyalama özelliği base class'a eklenmiştir (kotlin örneğine bakın) ya da
    bunun için built-in olarak ekstra bir fonksiyon yazılmıştır(MemberwiseClone örneği için 
    Csharp örneğine bakın). Ancak Python tip bağımsız çalıştığı için copy diye ayrı bir kütüphane
    yazılarak bu kütüphanenin copy fonksiyonu tipten bağımsız olarak "her nesne bir objedir" 
    düsturu gereği ilgili nesnenin sahip olduğu özellikleri tek tek yeni değişkene atar.
    Built-in copy fonksiyonu kütüphanesine bakarsanız sizi bir dispacther'a yönlendirir. Bu 
    dispacther'ın kaynak kodunu okuduğunuzdaysa copy ve deepcopy şeklinde iki fonksiyon olduğunu
    göreceksiniz. Bu sayede built-in ya da custom tip farketmeksizin copy fonksiyonunu direkt olarak
    aşağıdaki örnekte olduğu gibi kullanmanız mümkündür.
    """

    sezer = Employee("Sezer", "Bozkir")
    clone_sezer = deepcopy(sezer)

    print(sezer == clone_sezer)
