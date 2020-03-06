package AbstractFactory;

// Soyut sınıfımızdır.
abstract class Connection {
    public abstract Boolean openConnection();

    public abstract Boolean closeConnection();
}