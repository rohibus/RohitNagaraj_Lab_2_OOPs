public class Square extends Rectangle{

    public Square(String color, int length) 
    {
        super(color, length, length);
    }

    @Override
    public double calculateArea() 
    {
        return super.length * super.length;
    }
    
    @Override
    public double calculatePerimeter() 
    {
        return 4 * super.length;
    }
}
