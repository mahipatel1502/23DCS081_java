
import java.lang.*;
import java.util.*;

public class prac9 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter string : ");
        String s1 = sc.nextLine();
        double_char(s1);
        System.out.println("\n23DCS081 Mahi patel");

    }

    static void double_char(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
            System.out.print(s1.charAt(i));
        }

    }
}
