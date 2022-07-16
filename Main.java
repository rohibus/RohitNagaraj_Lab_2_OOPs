public class Main {
    public static void main(String[] args) 
    {
        String message = "Hi Rohit";
        String areaMessage = "Area of the shape ";
        String perimeterMessage = "Perimeter of the shape ";
        double area = 0;
        double perimeter = 0;

        System.out.println("Lab 2");
        IShape shape = new Square("Red", 5 );
        shape.renderer.draw(message);

        shape.renderer.draw(shape);
        shape.renderer.draw(areaMessage);
        area = shape.calculateArea();
        System.out.println(area);

        shape.renderer.draw(perimeterMessage);
        perimeter = shape.calculatePerimeter();
        System.out.println(perimeter);

        IShape shape2 = new Rectangle("Green", 5 , 4);
        shape2.renderer.draw(shape2);
        shape2.renderer.draw(areaMessage);
        area = shape2.calculateArea();
        System.out.println(area);

        shape2.renderer.draw(perimeterMessage);
        perimeter = shape2.calculatePerimeter();
        System.out.println(perimeter);

        IShape shape3 = new Triangle("Blue", 10, 10);
        shape3.renderer.draw(shape3);
        shape3.renderer.draw(areaMessage);
        area = shape3.calculateArea();
        System.out.println(area);

        shape3.renderer.draw(perimeterMessage);
        perimeter = shape3.calculatePerimeter();
        System.out.println(perimeter);

        IShape shape4 = new Circle("Orange", 5);
        shape4.renderer.draw(shape4);
        shape4.renderer.draw(areaMessage);
        area = shape4.calculateArea();
        System.out.println(area);

        shape4.renderer.draw(perimeterMessage);
        perimeter = shape4.calculatePerimeter();
        System.out.println(perimeter);
    }
}
