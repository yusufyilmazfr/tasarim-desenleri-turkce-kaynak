# -*- coding: utf-8 -*-

from abc import ABC, abstractclassmethod


class INotify(ABC):
    @abstractclassmethod 
    def send_notification(self, user):
        pass
