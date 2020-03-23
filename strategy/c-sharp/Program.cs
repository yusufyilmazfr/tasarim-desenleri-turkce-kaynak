using System;
using System.Collections.Generic;

namespace Strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.AddItem(new Item("894651364", 80));
            shoppingCart.AddItem(new Item("654798243", 20));

            shoppingCart.SetPaymentMethod(new PaypalPayment("yusufyilmazfr@gmail.com", "examplepassword"));
            shoppingCart.Pay();

            shoppingCart.SetPaymentMethod(new CreditCartPayment("Julia Rodriguez", "4373093149845972", "199", "12/2024"));
            shoppingCart.Pay();
        }
    }
}
