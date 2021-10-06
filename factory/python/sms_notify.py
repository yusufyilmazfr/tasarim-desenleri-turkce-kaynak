# -*- coding: utf-8 -*-

from inotify import INotify
from user import User

class SmsNotify(INotify):
    def send_notification(self, user: User):
        """Mail gönderme operasyonu. """
        pass 
