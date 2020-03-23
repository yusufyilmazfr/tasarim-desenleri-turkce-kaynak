package Strategy;

public class App {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Item("894651364", 80));
        shoppingCart.addItem(new Item("654798243", 20));

        shoppingCart.setPaymentMethod(new PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"));
        shoppingCart.Pay();

        shoppingCart.setPaymentMethod(new CreditCartPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"));
        shoppingCart.Pay();
    }
}
