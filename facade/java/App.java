package Facade;

public class App {
    public static void main(String[] args) {
        Customer duygu = new Customer("Duygu", "Kaya");

        CreditCardFacade creditCardFacade = new CreditCardFacade();
        creditCardFacade.createCreditCart(duygu);
    }
}
