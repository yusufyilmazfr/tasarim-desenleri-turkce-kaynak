# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 17.12.2021
from customer import Customer


# Kara liste ile ilgili işlemlerin yapıldığı sınıf
class BlackListService:
    def check_employee_is_the_blacklist(self, customer: Customer):
        """
        Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        varsayılan olarak true döndürdük.
        """
        return True
