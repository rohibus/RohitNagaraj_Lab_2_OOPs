public class Renderer {

    public void draw(String message) 
    {
        System.out.println(message);
    }

    public void draw(IShape shape) 
    {
        if (shape instanceof Square)
        {
            System.out.println("This is a Shape of Square");
        }

        if (shape instanceof Rectangle && !(shape instanceof Square))
        {
            System.out.println("This is a Shape of rectangle");
        }

        if (shape instanceof Circle)
        {
            System.out.println("This is a Shape of Circle");
        }

        if (shape instanceof Triangle)
        {
            System.out.println("This is a Shape of Triangle");
        }
    }
}
