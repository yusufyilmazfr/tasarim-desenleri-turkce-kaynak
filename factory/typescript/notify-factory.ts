import {INotify} from "./notify.interface";
import {SmsNotify} from "./sms-notify";
import {MailNotify} from "./mail-notify";

export enum NotifyType {
  SMS = 'SMS',
  MAIL = 'MAIL',
}

export class NotifyFactory {
  public createNotify(type: NotifyType): INotify {
    switch (type) {
      case NotifyType.SMS:
        // Buradaki nesne oluşturma süreçleri bize kalmıştır.
        // Kullanıcıdan soyutlanmıştır.
        // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
        return new SmsNotify();

      case NotifyType.MAIL:
        // Buradaki nesne oluşturma süreçleri bize kalmıştır.
        // Örnek olarak burası Singleton olarak da ayarlanabilirdi.
        // Kullanıcıdan soyutlanmıştır.
        return new MailNotify();

      default:
        throw new Error('Unsupported notify type!');
    }
  }
}
