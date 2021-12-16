# Created by Sezer BOZKIR<admin@sezerbozkir.com> at 16.12.2021
from smsnotify import SMSNotify
from mailnotify import MailNotify


class NotifyFactory:
    notifies = {'sms': SMSNotify,
                'mail': MailNotify}

    def create_notify(self, notify_type):
        return self.notifies[notify_type]()
