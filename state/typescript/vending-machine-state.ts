import {VendingMachine} from "./vending-machine";

// Davranışların tanımlandığı soyut sınıftır.
// UML diyagramındaki State yapısına denk gelmektedir.
export abstract class VendingMachineState {
  public abstract handleState(context: VendingMachine): void;
}
