
import java.util.Scanner;

class complex {

    int a, b;

    complex(){}

    complex(int r,int i){
        a=r;
        b=i;
    }


    void add(complex c1) {
        System.out.print("additon of two complex number --> ");
        System.out.println((a + c1.a) + " + "+ (b + c1.b)+"i ");
    }

    void sub(complex c1) {
        System.out.print("substraction of two complex number --> ");
        System.out.println((a - c1.a) + " + "+ (b - c1.b)+"i ");
    }

    void mul(complex c1) {
        System.out.print("multiplication of two complex number --> ");
        System.out.println((a * c1.a - b * c1.b) + " + "+ (a * c1.b + b * c1.a)+"i ");
    }

    void display() {
        System.out.println("real = " + a);
        System.out.println("img = " + b);
    }

}

public class prac16 {

    public static void main(String[] args) {
        complex c1 = new complex();
        Scanner sc= new Scanner(System.in);
        System.out.print("enter real number : ");
        int r1 = sc.nextInt();
        System.out.print("enter img number : ");
        int i1 = sc.nextInt();
        System.out.print("enter real number : ");
        int r2 = sc.nextInt();
        System.out.print("enter img number : ");
        int i2 = sc.nextInt();
        complex c2 = new complex(r1,i1);
        complex c3 = new complex(r2,i2);
        c2.display();
        c3.display();
        c2.add(c3);
        c2.sub(c3);
        c2.mul(c3);

        System.out.println("23DCS081  \nMahi patel");
    }
}
