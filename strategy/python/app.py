# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 22.12.2021
from shopping_cart import ShoppingCart
from paypal_payment import PaypalPayment
from credit_cart_payment import CreditCartPayment

from item import Item

if __name__ == '__main__':
    shopping_cart = ShoppingCart()
    shopping_cart.add_item(Item("894651364", 80))
    shopping_cart.add_item(Item("654798243", 20))

    shopping_cart.set_payment_method(PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"))
    shopping_cart.pay()  # Paid by Paypal.

    shopping_cart.set_payment_method(CreditCartPayment("Sezer Bozkir", "4373093149845972", "199", "12/2024"))
    shopping_cart.pay()  # output: Paid by credit cart.
