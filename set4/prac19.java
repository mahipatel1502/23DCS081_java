
import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {

    double side;

    public Square(double s) {          //child class constuctor
        super(s, s);                   //calling parent class constructor
        this.side = s;
    }

    double area() {
        return side * side;
    }

    double perimeter() {
        return 2 * (side + side);
    }

}

public class prac19 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter length of rectangle : ");
        double l = sc.nextDouble();
        System.out.print("enter breadth of rectangle : ");
        double b = sc.nextDouble();
        System.out.print("Enter side of square : ");
        double s = sc.nextDouble();

        Rectangle[] r = new Rectangle[2];

        r[0] = new Rectangle(l, b);
        r[1] = new Square(s);

        for (int i = 0; i < 2; i++) {

            System.out.println("area : " + r[i].area());
            System.out.println("perimeter : " + r[i].perimeter());
            System.out.println();

        }

        System.out.println("23DCS081 Mahi patel");

    } 
}

