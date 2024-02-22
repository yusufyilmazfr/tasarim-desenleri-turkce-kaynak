import 'mail_notify.dart';
import 'sms_notify.dart';
import 'user.dart';

abstract class INotify {
  void sendNotification(User user);

  // Alternatif
  //? Ayrıca bakınız: https://dart.dev/language/constructors#factory-constructors
  factory INotify.createNotify(String type) {
    switch (type) {
      case "MAIL":
        return MailNotify();
      case "SMS":
        return SmsNotify();
      default:
        throw "Geçersiz bildirim türü.";
    }
  }
}
