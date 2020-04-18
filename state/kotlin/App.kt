package State

fun main(args: Array<String>) {
    val vendingMachine = VendingMachine()
    vendingMachine.requestProduct("COVID-19 MASKE", 2.0)

    // output:
    //  InitializeState: Ön hazırlıklar yapılıyor.
    //  WaitingState: Otomata herhangi bir aksiyon bekliyor.
    //  PreparingState: İstenilen ürün hazırlanıyor.Lütfen bekleyiniz
    //  DeliveryState: Ürün teslim ediliyor.
    //  WaitingState: Otomata herhangi bir aksiyon bekliyor.
}
