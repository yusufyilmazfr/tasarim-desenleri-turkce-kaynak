import {DataAnalyzerBase} from "./data-analyzer-base";

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
export class XmlDataAnalyzer extends DataAnalyzerBase {
  public exportResult(result: object): void {
    // Durumun XML'e dönüştürülmesi işlemleri yer alacaktır.
    console.log("XML exported.");
  }
}
