import {ShoppingCart} from "./shopping-cart";
import {Item} from "./item";
import {PaypalPayment} from "./paypal-payment";
import {CreditCartPayment} from "./credit-cart-payment";

function main() {
  const shoppingCart = new ShoppingCart();
  shoppingCart.addItem(new Item('531858492', 80));
  shoppingCart.addItem(new Item('931858492', 20));

  shoppingCart.setPaymentMethod(new PaypalPayment('johndoe@mail.com', 'strongpassword'));
  shoppingCart.pay();

  shoppingCart.setPaymentMethod(new CreditCartPayment('John Doe', '9392593929593929', '794', '15/2030'));
  shoppingCart.pay();
}
