package Proxy;

public class App {
    public static void main(String[] args) {
        Person semanur = new Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz");

        IOrderableMask orderableMask = new AuthenticatableMaskOrderProxy();

        orderableMask.createOrder(semanur);
        // output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz
    }
}
