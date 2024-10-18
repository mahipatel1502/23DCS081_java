

import java.util.*;
public class prac10 {
    public static void main(String[] args)
    {
        String s="Hello world!";
     
        System.out.println("Length of String: "+s.length());
        System.out.println("Lowercase of the string: "+s.toLowerCase());
        System.out.println("Uppercase of the string: "+s.toUpperCase());
        System.out.print("String in reverse order :");
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
          

        System.out.println();
        char[] temp=s.toCharArray();
        Arrays.sort(temp);
        String sorted_string=new String(temp);
        System.out.print("Sorted String:");
        System.out.println(sorted_string);
        System.out.println("\n23dcs081 Mahi patel");
    }
}