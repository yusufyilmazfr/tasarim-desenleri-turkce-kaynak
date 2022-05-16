package Facade

// Banka müşterimizi temsili oluşturan sınıf.
class CreditCardFacade {
    fun createCreditCart(customer: Customer) {
        val creditCardManager = CreditCardManager()

        val blackListService = BlackListService()

        if (!blackListService.checkEmployeeIsTheBlackList(customer)) {
            creditCardManager.createCreditCart(customer)
        }
    }
}
