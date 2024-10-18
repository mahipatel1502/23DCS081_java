import java.util.*;
class employee {

    String first_name;
    String last_name;
    double salary;

    employee(String fn, String ln, double s) {
        first_name = fn;
        last_name = ln;
        if (salary < 0) {
            salary = 0;
        } else {
            salary = s;
        }

    }

    void y_salary() {
        System.out.println("yearly salary :" + salary * 12);
    }

    void rais_salary() {
        System.out.println("after 10% Raise");
        System.out.println("salary :" + (salary + (salary * 0.1)));
    }
}

public class prac13 {

    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        System.out.print("enter first name : ");
        String s1 = sc1.nextLine();
        System.out.print("enter last name : ");
        String s2 = sc1.nextLine();
        System.out.print("enter salary : ");
        double salary1 = sc1.nextDouble();
        employee e1 = new employee(s1, s2, salary1);
        e1.rais_salary();
        e1.y_salary();
        System.out.println("");
        Scanner sc2= new Scanner(System.in);
        System.out.print("enter first name : ");
        String s3 = sc2.nextLine();
        System.out.print("enter last name : ");
        String s4 = sc2.nextLine();
        System.out.print("enter salary : ");
        double salary2 = sc2.nextDouble();
        employee e2 = new employee(s3, s4, salary2);
        e2.rais_salary();
        e2.y_salary();

        System.out.println("\n23DCS081 Mahi patel");

    }
}

