from customer import Customer
from credit_card_manager import CreditCardManager
from blacklist_service import BlackListService


class CreditCardFacade:
    def create_credit_card(self, customer: Customer):
        credit_card_manager = CreditCardManager()
        black_list_service = BlackListService()
        if not black_list_service.check_employee_is_the_blacklist(customer):
            credit_card_manager.create_credit_card(customer)
