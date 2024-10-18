import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class mycalculator implements AdvancedArithmetic{
     public int divisor_sum(int n){
        int sum=0;
         for (int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
         }
          return sum;
     }
}

public class prac22 {
    public static void main(String[] args) {
       mycalculator c = new mycalculator();
       Scanner sc = new Scanner(System.in);
       System.out.print("enter n : ");
       int n= sc.nextInt();
       int s = c.divisor_sum(n);
       System.out.println("sum of divisor : " + s);
       System.out.println("\n23dcs081 Mahi patel");
    }
}
