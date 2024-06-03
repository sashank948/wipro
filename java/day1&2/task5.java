public class task5 {
    public static void main(String[] args) {
    Circle circle = new Circle(7);
    Rectangle rectangle = new Rectangle(43.0, 55.0);
   
    System.out.println("Area of circle: " + circle.area());
    System.out.println("Area of rectangle: " + rectangle.area());
    }
   }
   class Shape {
    public double area() {
    return 0.0;
    }
   }
   class Circle extends Shape {
    private double radius;
   
    public Circle(double radius) {
    this.radius = radius;
    }
   
   
    public double area() {
    return Math.PI * radius * radius;
    }
   }
   class Rectangle extends Shape {
    private double length;
    private double width;
   
    public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    }
   
  
    public double area() {
    return length * width;
    }
   }