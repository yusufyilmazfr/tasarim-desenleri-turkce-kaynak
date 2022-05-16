package Facade;

// Banka müşterimizi temsili oluşturan sınıf.
public class CreditCardFacade {
    public void createCreditCart(Customer customer) {
        CreditCardManager creditCardManager = new CreditCardManager();

        BlackListService blackListService = new BlackListService();

        if (!blackListService.checkEmployeeIsTheBlackList(customer)) {
            creditCardManager.createCreditCart(customer);
        }
    }
}
