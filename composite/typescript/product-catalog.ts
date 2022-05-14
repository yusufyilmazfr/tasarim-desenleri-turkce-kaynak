import {ICatalogComponent} from "./catalog-component.interface";

// Somut yapımızdır.
// UML diyagramındaki Composite kısmına denk gelmektedir.
// Component (ICatalogComponent) listesi tutmaktadır.
export class ProductCatalog implements ICatalogComponent {
  private readonly name: string;
  private readonly components: Set<ICatalogComponent>;

  constructor(name: string) {
    this.name = name;
    this.components = new Set<ICatalogComponent>();
  }

  public add(catalogComponent: ICatalogComponent): void {
    this.components.add(catalogComponent);
  }

  public remove(catalogComponent: ICatalogComponent): void {
    this.components.delete(catalogComponent);
  }

  public drawHierarchy(): void {
    for (let component of this.components) {
      component.drawHierarchy();
    }
  }
}
