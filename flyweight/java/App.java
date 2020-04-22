package Flyweight;

public class App {
    public static void main(String[] args) {
        BoxFactory boxFactory = new BoxFactory();

        Box blackBox1 = boxFactory.get(BoxColor.BLACK);
        Box blackBox2 = boxFactory.get(BoxColor.BLACK);
        Box blackBox3 = boxFactory.get(BoxColor.BLACK);
        Box blueBox1 = boxFactory.get(BoxColor.BLUE);

        blackBox1.draw(97, 37);
        blackBox2.draw(34, 78);
        blackBox3.draw(74, 193);
        blueBox1.draw(1, 4);
        // output:
        //  Black box drawn. 97,37
        //  Black box drawn. 34,78
        //  Black box drawn. 74,193
        //  Blue box drawn. 1,4
    }
}
