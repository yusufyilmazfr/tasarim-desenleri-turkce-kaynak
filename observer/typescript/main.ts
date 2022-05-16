import {ObserverUser} from "./observer-user";
import {Samsung} from "./samsung";

function main() {
  // Güncellemeden etkilenecek olan sınıf örnekleri.
  const mehmet = new ObserverUser();
  const derya = new ObserverUser();
  const sema = new ObserverUser();
  const aleyna = new ObserverUser();

  // İzlenecek olan sınıf örneği.
  const samsung = new Samsung();

  // İzlenecek olan sınıfa etkilenecek olan nesnelerin atanması.
  samsung.addObserver(mehmet);
  samsung.addObserver(derya);
  samsung.addObserver(sema);
  samsung.addObserver(aleyna);

  samsung.changePrice();
  // output:
  //  Samsung updated. Message: Samsung's price updated.
  //  Samsung updated. Message: Samsung's price updated.
  //  Samsung updated. Message: Samsung's price updated.
  //  Samsung updated. Message: Samsung's price updated.
}
