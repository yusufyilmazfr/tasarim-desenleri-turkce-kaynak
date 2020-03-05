package Factory;

public class MailNotify implements INotify {
    @Override
    public void sendNotification(User user) {
        // Mail gönderme operasyonu.
        System.out.println("Email Gönderildi.");
    }
}
