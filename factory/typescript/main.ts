import {NotifyFactory, NotifyType} from "./notify-factory";
import {User} from "./user";

function main() {
  const notifyFactory = new NotifyFactory();
  const notify = notifyFactory.createNotify(NotifyType.MAIL);

  notify.sendNotification(new User());
}
