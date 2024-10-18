
class parent{
    void display_parent(){
        System.out.println("this is parent");
    }
}

class child extends parent{
    void display_child(){
        System.out.println("this is child");
    }
}

public class prac17 {

    public static void main(String[] args) {

        child c = new child();
        c.display_child();
        c.display_parent();
        System.out.println("23DCS081 Mahi patel");
       
    }
    
}
