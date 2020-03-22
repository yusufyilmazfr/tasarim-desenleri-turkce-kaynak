package Facade;

// Kara liste ile ilgili işlemlerin yapıldığı sınıf
public class BlackListService {
    public Boolean checkEmployeeIsTheBlackList(Customer customer)
    {
        // Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
        // Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
        // Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
        // Default olarak true döndürdük.
        return true;
    }
}
