package main

type NotifyFactory struct {
}

func newNotifyFactory() NotifyFactory {
	return NotifyFactory{}
}

func (n NotifyFactory) createNotify(notifyType string) Notify {
	switch notifyType {
	case "SMS":
		// Buradaki nesne oluşturma süreçleri bize kalmıştır.
		// Kullanıcıdan soyutlanmıştır.
		// Örnek olarak burası Singleton olarak da ayarlanabilirdi.
		return newSMSNotify()
	case "MAIL":
		// Buradaki nesne oluşturma süreçleri bize kalmıştır.
		// Kullanıcıdan soyutlanmıştır.
		// Örnek olarak burası Singleton olarak da ayarlanabilirdi.
		return newMailNotify()
	default:
		return nil
	}
}
