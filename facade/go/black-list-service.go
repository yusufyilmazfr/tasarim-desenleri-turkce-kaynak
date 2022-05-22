package main

// Kara liste ile ilgili işlemlerin yapıldığı sınıf
type blackListService struct {
}

func NewBlackListService() *blackListService {
	return &blackListService{}
}

func (s blackListService) CheckEmployeeIsTheBlackList(_ Customer) bool {
	// Müşterinin kara listede olup olmadığının kontrolünün yapıldığı yer.
	// Kara listede ise false, değilse true dönmekte olduğunu var sayalım.
	// Burada veri tabanı kodları ya da harici bir servis ile iletişim sağlanabilir.
	// Default olarak true döndürdük.
	return true
}
