public class Triangle implements IShape {
    int base;
    int height;
    String color;

    public Triangle(String color, int base, int height)
    {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double)(this.base * this.height)/2;
    }

    @Override
    public double calculatePerimeter() {
        double halfbase = (double)this.base/2;
        double side = Math.sqrt(halfbase * halfbase + this.height * this.height);
        return base + side + side;
    }
    
}
