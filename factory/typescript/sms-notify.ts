import {INotify} from "./notify.interface";
import {User} from "./user";

export class SmsNotify implements INotify {
  sendNotification(user: User): void {
    // SMS gönderme operasyonu.
  }
}
