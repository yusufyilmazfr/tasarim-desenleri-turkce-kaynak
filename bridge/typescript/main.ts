import {TextMessageSender} from "./text-message-sender";
import {TextMessage} from "./text-message";
import {EmailMessageSender} from "./email-message-sender";

async function main() {
  const textMessageSender = new TextMessageSender();
  const textMessage = new TextMessage(textMessageSender);
  await textMessage.send(); // output: TextMessageSender: Sending text message...

  const emailMessageSender = new EmailMessageSender();
  const emailMessage = new TextMessage(emailMessageSender);
  await emailMessage.send(); // output: EmailMessageSender: Sending email message...
}
