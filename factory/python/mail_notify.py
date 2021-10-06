# -*- coding: utf-8 -*-

from inotify import INotify
from user import User


class MailNotify(INotify):
    def send_notification(self, user: User):
        """Sms gönderme operasyonu. """
        pass 
