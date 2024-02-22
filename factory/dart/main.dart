import 'i_notify.dart';
import 'notify_factory.dart';
import 'user.dart';

void main() {
  const NotifyFactory notifyFactory = NotifyFactory();

  final INotify? notify = notifyFactory.createNotify('MAIL');
  notify?.sendNotification(const User());

  // Alternatif
  final INotify notify2 = INotify.createNotify('SMS');
  notify2.sendNotification(const User());
}
