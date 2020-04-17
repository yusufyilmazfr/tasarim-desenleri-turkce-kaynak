package Proxy

fun main(args: Array<String>) {
    val semanur = Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz")

    val orderableMask = AuthenticatableMaskOrderProxy()

    orderableMask.createOrder(semanur)
    // output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz
}
