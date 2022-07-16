public  class Rectangle implements IShape{
    int length, breadth;
    public String color;

    public Rectangle(String color, int length, int breadth)
    {
        this.color = color;
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() 
    {
        return this.length * this.breadth;
    }

    @Override
    public double calculatePerimeter() 
    {
        return 2*(this.length + this.breadth);
    }
    
}
