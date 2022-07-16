public class Circle implements IShape{
    static final double Pi = 3.142;
    int radius;
    String color;

    public Circle(String color, int radius)
    {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Pi * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Pi * this.radius;
    }
    
}
