import {ICatalogComponent} from "./catalog-component.interface";

// Somut yapımızdır.
// UML diyagramındaki Leaf kısmına denk gelmektedir.
// Hiyerarşinin en alt tabakasını temsil etmektedir.
export class Product implements ICatalogComponent {
  private readonly name: string;

  constructor(name: string) {
    this.name = name;
  }

  public drawHierarchy(): void {
    console.log(this.name);
  }
}
