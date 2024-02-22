import 'i_notify.dart';
import 'mail_notify.dart';
import 'sms_notify.dart';

final class NotifyFactory {
  const NotifyFactory();

  INotify? createNotify(String notifyType) {
    if (notifyType == 'SMS') {
      return const SmsNotify();
    } else if (notifyType == 'MAIL') {
      return const MailNotify();
    }
    return null;
  }
}
