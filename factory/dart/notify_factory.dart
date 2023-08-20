import 'i_notify.dart';
import 'mail_notify.dart';
import 'sms_notify.dart';

final class NotifyFactory {
  const NotifyFactory();

  INotify? createNotify(String notifyType) {
    if (notifyType == "SMS") {
      // Buradaki nesne oluşturma süreçleri bize kalmıştır.
      // Kullanıcıdan soyutlanmıştır.
      // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
      return SmsNotify();
    } else if (notifyType == "MAIL") {
      // Buradaki nesne oluşturma süreçleri bize kalmıştır.
      // Kullanıcıdan soyutlanmıştır.
      // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
      return MailNotify();
    }
    return null;
  }
}
