import {INotify} from "./notify.interface";
import {User} from "./user";

export class MailNotify implements INotify {
  sendNotification(user: User): void {
    // Mail gönderme operasyonu.
  }
}
