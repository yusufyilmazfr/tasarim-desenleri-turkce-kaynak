package Factory;

public class App {
    public static void main(String[] args) {
        NotifyFactory notifyFactory = new NotifyFactory();

        INotify notify = notifyFactory.CreateNotify("SMS");

        notify.sendNotification(new User());
    }
}
