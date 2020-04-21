package Observer;

public class App {
    public static void main(String[] args) {
        // Güncellemeden etkilenecek olan sınıf örnekleri.
        IObserverUser mehmet = new ObserverUser();
        IObserverUser derya = new ObserverUser();
        IObserverUser sema = new ObserverUser();
        IObserverUser aleyna = new ObserverUser();


        // İzlenecek olan sınıf örneği.
        Samsung samsung = new Samsung();

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
}
