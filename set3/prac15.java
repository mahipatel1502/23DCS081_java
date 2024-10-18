import java.util.*;

class area{
    double length;
    double breadth;

    area(double l, double b){
        length=l;
        breadth=b;
    }

    double returnArea(){
        return length*breadth;
    }
}

public class prac15 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter length : ");
        double l= sc.nextDouble();
        System.out.print("enter breadth : ");
        double b= sc.nextDouble();
        area a1= new area(l, b);
        System.out.println("Rectangle area : " + a1.returnArea());
        System.out.println("\n23DCS081  \nMahi patel");
    }
    
}
