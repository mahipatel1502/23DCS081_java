
import java.util.*;

class date {

    int month, date, year;

    date(int d, int m, int y) {
        date = d;
        month = m;
        year = y;
    }

    void setdate(int d) {
        date = d;
    }

    int getdate() {
        return date;
    }

    void setmonth(int m) {
        month = m;
    }

    int getmonth() {
        return month;
    }

    void setyear(int y) {
        year = y;
    }

    int getyear() {
        return year;
    }

    void display() {
        System.out.println(date + "/" + month + "/" + year);
    }
}

public class prac14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter date : " );
        int d = sc.nextInt();
        System.out.print("enter month : " );
        int m = sc.nextInt();
        System.out.print("enter year : " );
        int y = sc.nextInt();
        date d1 = new date(d, m, y);
        d1.setdate(d);
        System.out.println(d1.getdate());
        //d1.getdate();
        d1.setmonth(m);
        System.out.println(d1.getmonth());
        d1.setyear(y);
        System.out.println(d1.getyear());
        d1.display();
    }

}
