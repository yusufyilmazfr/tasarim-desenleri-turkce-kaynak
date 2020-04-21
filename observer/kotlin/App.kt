package Observer

fun main(args: Array<String>) {
    // Güncellemeden etkilenecek olan sınıf örnekleri.
    val mehmet = ObserverUser()
    val derya = ObserverUser()
    val sema = ObserverUser()
    val aleyna = ObserverUser()


    // İzlenecek olan sınıf örneği.
    val samsung = Samsung()

    // İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
    samsung.addObserver(mehmet)
    samsung.addObserver(derya)
    samsung.addObserver(sema)
    samsung.addObserver(aleyna)

    samsung.changePrice()

    // output:
    //  Samsung updated. Message: Samsung's price updated.
    //  Samsung updated. Message: Samsung's price updated.
    //  Samsung updated. Message: Samsung's price updated.
    //  Samsung updated. Message: Samsung's price updated.
}
