package Flyweight;

// Flyweight (Box) şablonunu uygulayan sınıftır.
// UML diyagramındaki ConcreteFlyweight sınıfına denk gelmektedir.
class BlueBox extends Box {
    public BlueBox(int width, int height) {
        this.width = width;
        this.height = height;
        this.boxColor = BoxColor.BLUE;
    }

    @Override
    public void draw(int locationX, int locationY) {
        String message = String.format("%s box drawn. %d,%d", boxColor, locationX, locationY);
        System.out.println(message);
    }
}