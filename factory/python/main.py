# -*- coding: utf-8 -*-

from notify_factory import NotifyFactory
from user import User


def main():
    notify_factory = NotifyFactory()
    notify = notify_factory.create_notify('MAIL')

    notify.send_notification(User())


if __name__ == '__main__':
    main()
