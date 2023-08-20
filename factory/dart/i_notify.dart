import 'user.dart';

abstract class INotify {
  const INotify();

  void sendNotification(User user);
}
