import {Person} from "./person";
import {AuthenticatableMaskOrderProxy} from "./authenticatable-mask-order-proxy";

function main() {
  const semanur = new Person("11111111111", "İstanbul/Sancaktepe xxx-yyy-zzz");
  const orderableMask = new AuthenticatableMaskOrderProxy();

  orderableMask.createOrder(semanur);
  // output: Order created to İstanbul/Sancaktepe xxx-yyy-zzz.
}
