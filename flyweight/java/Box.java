package Flyweight;

// Nesnenin ortak özelliklerini tutan sınıftır.
// UML diyagramındaki Flyweight yapısına denk gelmektedir.
abstract class Box
{
    // Intrinsic değerler.
    public int width;
    public int height;
    public BoxColor boxColor;

    public abstract void draw(int locationX, int locationY);
}
