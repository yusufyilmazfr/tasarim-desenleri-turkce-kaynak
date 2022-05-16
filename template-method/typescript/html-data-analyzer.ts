import {DataAnalyzerBase} from "./data-analyzer-base";

// UML diyagramındaki AbstractClass (DataAnalyzerBase) sınıfından türer.
// UML diyagramındaki ConcreteClass yapısına denk gelmektedir.
export class HtmlDataAnalyzer extends DataAnalyzerBase {
  public exportResult(result: object): void {
    // Durumun HTML'e dönüştürülmesi işlemleri yer alacaktır.
    console.log("HTML exported.");
  }
}
