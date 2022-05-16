import {Customer} from "./customer";
import {CreditCardManager} from "./credit-card-manager";
import {BlackListService} from "./black-list-service";

export class CreditCardFacade {
  public createCreditCard(customer: Customer): void {
    const creditCardManager = new CreditCardManager();
    const blackListService = new BlackListService();

    if(!blackListService.checkEmployeeIsTheBlackList(customer)) {
      creditCardManager.createCreditCart(customer);
    }
  }
}
