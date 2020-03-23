package Strategy;

// UMl diyagramındaki ConcreteStrategy sınıfına denk gelmektedir.
// UML diyagramındaki Strategy arayüzüne denk gelen arayüzü uyguluyor.
class PaypalPayment implements IPayment {
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        // Kredi kartı ödeme işlemlerinin gerçekleştiği yer.
        System.out.println("Paid by Paypal.");
    }
}