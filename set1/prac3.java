
import java.util.Scanner;

public class prac3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter distance in meter");
        float meter = sc.nextFloat();
        System.out.println("enter hr");
        float h = sc.nextFloat();
        System.out.println("enter min");
        float min = sc.nextFloat();
        System.out.println("enter sec");
        float sec = sc.nextFloat();

        float ts = (h * 60 * 60) + (min * 60) + sec;
        float s1 = meter / ts;               //speed in meter
        float s2 = (meter / 1000) / (ts / 3600);  //speed in kilometer per hour
        float s3 = (meter / 1609) / (ts / 3600);  //speed in mile per hour

        System.out.println("speed meter per second : " + s1);
        System.out.println("speed kilometer per hour : " + s2);
        System.out.println("mile per second : " + s3);

        System.out.println("23DCS081 Mahi patel");

    }

}
