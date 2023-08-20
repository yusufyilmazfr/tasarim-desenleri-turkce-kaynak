import 'i_notify.dart';
import 'notify_factory.dart';
import 'user.dart';

void main() {
  //? Bu örnek diğer dillerin örnekleri ile tamamen aynı olsun diye bu şekilde yazıldı. Sorunsuz çalışır.
  //? Dart dilinde bu şekilde kullanmak yerine 'factory' anahtar kelimesi kullanılabilir.
  //? Ayrıca bakınız: https://dart.dev/language/constructors#factory-constructors

  final NotifyFactory notifyFactory = NotifyFactory();

  final INotify? notify = notifyFactory.createNotify("MAIL");

  notify?.sendNotification(User());
}
