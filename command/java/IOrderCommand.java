package Command;

// Temel arayüzdür.
// Komutların çalıştırılması için temel metotu içermektedir.
// UML diyagramındaki Command arayüzüne denk gelmektedir.
interface IOrderCommand {
    void execute();
}
