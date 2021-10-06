# -*- coding: utf-8 -*-

from inotify import INotify
from sms_notify import SmsNotify
from mail_notify import MailNotify

class NotifyFactory:
    def create_notify(self, notify_type: str) -> INotify:
        if notify_type == 'SMS':
            # Buradaki nesne oluşturma süreçleri bize kalmıştır.
            # Kullanıcıdan soyutlanmıştır.
            # Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return SmsNotify()
        elif notify_type == 'MAIL':
            # Buradaki nesne oluşturma süreçleri bize kalmıştır.
            # Kullanıcıdan soyutlanmıştır.
            # Örnek olarak burası Singleton olarak da ayarlanabilirdi.
            return MailNotify()
        return None
