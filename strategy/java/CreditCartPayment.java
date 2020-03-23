package Strategy;

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class CreditCartPayment implements IPayment {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCartPayment(String name, String ccNum, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.dateOfExpiry = expiryDate;
    }

    public void pay(int amount) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        System.out.println("Paid by credit cart.");
    }
}