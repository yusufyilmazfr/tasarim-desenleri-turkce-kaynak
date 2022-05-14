// Temel arayüzdür.
// Komutların çalıştırılması için temel metotu içermektedir.
// UML diyagramındaki Command arayüzüne denk gelmektedir.
export interface IOrderCommand {
  execute(): Promise<void>;
}
