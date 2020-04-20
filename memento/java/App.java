package Memento;

public class App {
    public static void main(String[] args) {
        TextOriginator textOriginator = new TextOriginator();

        textOriginator.text = "asm";
        textOriginator.cursorPosition = 3;

        // Anlık durum yığına ekleniyor.
        textOriginator.save();


        textOriginator.text = "asmi";
        textOriginator.cursorPosition = 4;

        // Anlık durum yığına ekleniyor.
        textOriginator.save();

        textOriginator.text = "asmin";
        textOriginator.cursorPosition = 5;

        // Anlık durum yığına ekleniyor.
        textOriginator.save();

        // Yığındaki bir önceki duruma geçiyor.
        textOriginator.undo();
        System.out.println(textOriginator.ToString());

        // Yığındaki bir önceki duruma geçiyor.
        textOriginator.undo();
        System.out.println(textOriginator.ToString());

        // Yığındaki bir önceki duruma geçiyor.
        textOriginator.undo();
        System.out.println(textOriginator.ToString());

        //output:
        //  text: asmin, cursor position: 5
        //  text: asmi, cursor position: 4
        //  text: asm, cursor position: 3
    }
}
