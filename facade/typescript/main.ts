import {Customer} from "./customer";
import {CreditCardFacade} from "./credit-card-facade";

function main() {
  const duygu = new Customer('Duygu', 'Kaya');

  const creditCardFacade = new CreditCardFacade();
  creditCardFacade.createCreditCard(duygu);
}
