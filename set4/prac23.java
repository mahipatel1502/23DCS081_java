import java.util.Scanner;

interface Shape {
    String getColor();
    default double getArea() {
        return 0;
    }
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Sign {
    private Shape backgroundShape;
    private String text;

    public Sign(Shape backgroundShape, String text) {
        this.backgroundShape = backgroundShape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println("Sign:");
        System.out.println("Background Shape Color: " + backgroundShape.getColor());
        System.out.println("Background Shape Area: " + backgroundShape.getArea());
        System.out.println("Text: " + text);
    }
}

public class prac23 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter radius and color for the circle: ");
            double cr = sc.nextDouble();
            sc.nextLine();  // consume the leftover newline
            String cc = sc.nextLine();

            Circle circle = new Circle(cr, cc);

            System.out.println("Enter length, width, and color for the rectangle: ");
            double rl = sc.nextDouble();
            double rw = sc.nextDouble();
            sc.nextLine();  // consume the leftover newline
            String rc = sc.nextLine();

            Rectangle rectangle = new Rectangle(rl, rw, rc);

            System.out.println("Enter text for the circle sign: ");
            String cs = sc.nextLine();
            Sign circleSign = new Sign(circle, cs);

            System.out.println("Enter text for the rectangle sign: ");
            String rs = sc.nextLine();
            Sign rectangleSign = new Sign(rectangle, rs);

            circleSign.displaySign();
            rectangleSign.displaySign();
            System.out.println("23dcs081 Mahi patel");
        
    }
}
