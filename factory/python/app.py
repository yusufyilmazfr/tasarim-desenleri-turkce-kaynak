from notify import NotifyFactory

if __name__ == '__main__':
    notify_factory = NotifyFactory()
    notify = notify_factory.create_notify('mail')
    notify.send_notify()
