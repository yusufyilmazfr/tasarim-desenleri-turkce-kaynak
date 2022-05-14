// Metot iskeletimizi ve soyutlanmış metotları içermektedir.
// UML diyagramındaki AbstractClass yapısına denk gelmektedir.
export abstract class DataAnalyzerBase {
  // Metot iskeletimiz.
  public analyzeDataOfLastWeek(): void {
    const data = this.getDataOfLastWeek();
    const result = this.analyzeData(data);
    this.exportResult(result);
  }

  private getDataOfLastWeek(): object {
    // Burada veri verinin çağrılma süreçleri yer alacaktır.
    // Default olarak bir obje dönülmektedir.
    console.log("Method worked: GetDataOfLastWeek");
    return {};
  }

  private analyzeData(data: object): object {
    // Burada verinin analizi süreci yer almaktadır.
    // Analiz sonuçları default olarak bir obje dönmektedir.
    console.log("Method worked: AnalyzeData");
    return {};
  }

  // Alt sınıflar tarafından uygulanmasını istediğimiz metottur.
  // Metot iskeleti içerisinde farklılık gösterecek olan metotumuzdur.
  public abstract exportResult(result: object): void
}
