package Bridge;

public abstract class Message {
    protected IMessageSender messageSender;

    public Message(IMessageSender messageSender)
    {
        this.messageSender = messageSender;
    }

    public abstract void send();
}
