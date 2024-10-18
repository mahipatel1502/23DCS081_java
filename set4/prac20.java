class shape{
    void print_shape(){
         System.out.println("this is shape");
    }
}

class circle extends shape{
    void print_circle(){
        System.out.println("this is circlular shape ");
    }
}

class rectagle extends shape{
    void print_rectangle(){
        System.out.println("this is rectanglular shape");
    }
}

class square extends rectagle{
    void print_square(){
        System.out.println("Square is rectangle");
    }
}

public class prac20 {
    public static void main(String[] args){
        square s= new square();
        s.print_shape();           //method of class shape
        s.print_rectangle();          //method of class rectangle
      System.out.println("23DCS081 Mahi patel");
       
    }
}
