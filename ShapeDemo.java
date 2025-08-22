public class ShapeDemo{
    public static void main(String args[]){
        System.out.println("Displaying shape area");

        Shape shape1 =new Circle(8);
        shape1.calculateArea();
        shape1.display();

        Shape shape2 =new Rectangle(4,9);
        shape2.calculateArea();
        shape2.display();
    }
}

abstract class Shape{
    protected double area;

    abstract void calculateArea();

    void display(){
        System.out.println("Displaying Shape area");
    }
}

class Circle extends Shape{
    private final double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    void calculateArea(){
        this.area = Math.PI * radius * radius;
    }
    @Override
    void display(){
        System.out.println("Area of circle: "+ String.format("%.1f",this.area));
    }
}

class Rectangle extends Shape{
    private final double length;
    private final double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea(){
        this.area = length * width;
    }
    @Override
    void display(){
        System.out.println("Area of Rectangle: "+ String.format("%.1f",this.area));
    }
}