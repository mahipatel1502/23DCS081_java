
import java.util.*;
public class prac11 {
    public static void main(String [] args){
       // String s1="CHARUSAT UNIVERSITY";
        // System.out.println("length of string is : " + s1.length());
        // System.out.println("lower case : "+ s1.toLowerCase());
        // System.out.println("replace character : " + s1.replace('H', 'M'));
        // System.out.println("23DCS081 Mahi patel");

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        char[] s = s1.toCharArray();
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=i+1;j<s1.length();j++){
                if(s[i]==s[j]){
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
