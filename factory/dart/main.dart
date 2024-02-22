import 'i_notify.dart';
import 'notify_factory.dart';
import 'user.dart';

void main() {
  final NotifyFactory notifyFactory = NotifyFactory();

  final INotify? notify = notifyFactory.createNotify("MAIL");
  notify?.sendNotification(User());

  // Alternatif
  final INotify notify2 = INotify.createNotify("SMS");
  notify2.sendNotification(User());
}
