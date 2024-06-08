abstract class Shape 
{
    abstract double area();
    void display()
	{
        System.out.println("Displaying the shape.");
    }
}

class Circle extends Shape
{
    double radius;
    Circle(double radius) 
	{
        this.radius = radius;
    }

    @Override
    double area() 
	{
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, width;

    Rectangle(double length, double width) 
	{
        this.length = length;
        this.width = width;
    }
    @Override
    double area() 
	{
        return length * width;
    }
}

public class AbstractClassExample 
{
    public static void main(String args[]) 
	{
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of the circle: " + circle.area());
        System.out.println("Area of the rectangle: " + rectangle.area());
        circle.display();
        rectangle.display();
    }
}
