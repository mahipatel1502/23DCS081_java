
import java.lang.*;
import java.util.*;

public class prac7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1= sc.nextLine();
        System.out.print("enter n:");
        int n=sc.nextInt();
        front_times(s1, n);
        System.out.println("\n23DCS081 Mahi patel");

    }

    static void front_times(String s1,int n ){
        String s=s1.substring(0,3);
         for(int i=0;i<n;i++){
             System.out.print(s);
         }
    }
}
