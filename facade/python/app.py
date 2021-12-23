from customer import Customer
from credit_card_facade import CreditCardFacade

if __name__ == '__main__':
    duygu = Customer("Duygu", "Kaya")
    credit_card_facade = CreditCardFacade()
    credit_card_facade.create_credit_card(duygu)
