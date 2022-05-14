import {User} from "./user";

export interface INotify {
  sendNotification(user: User): void;
}
