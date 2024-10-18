// import java.util.*;

// class prac6 {
//     public static void main(String []args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("enter n :");
//         int n=sc.nextInt();
//         int n1=0,n2=1,n3;
       
//         for(int i=3; i<n ; i++){
//             System.out.println(n1);
//             n3=n1+n2;
//             n1=n2;
//             n2=n3;
//         }
//       System.out.println("23DCS081 Mahi patel");   
//     }
// }

import java.util.*;
public class prac6
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int i;
        int D;

        int a = 0;
        int b = 1;
        int c;

        System.out.println(" ");

        System.out.print("Enter Number of Days : ");
        D = sc.nextInt();

        System.out.println(" ");

        for(i=0;i<D;i++)
        {
                System.out.println("Day " + (i+1) + " : " + a);

                c = a + b;
                a = b;
                b = c;
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("23DCS081 Mahi Patel");

        sc.close();

    }
}

