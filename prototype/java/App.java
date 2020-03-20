package Prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee gulizar = new Employee("Gülizar", "Yılmaz");
        Employee cloneGulizar = gulizar.clone();

        // Aynı nesne örneklerini farklı referanslarda tutuyor.
        // Birbirinin aynısı ve farklı referanslarda olan nesneler elde ettik.
        System.out.println(gulizar == cloneGulizar); //output: false
    }
}