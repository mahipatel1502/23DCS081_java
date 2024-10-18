class degree{
    void getdegree(){
        System.out.println("I got a degree");
    }
}

class undergraduate extends degree{
    void getDegree(){
        System.out.println("I am an undergraduate");
    }
}

class postgraduate extends degree{
    void getDegree(){
        System.out.println("I am a postgraduate");
    }
}

public class prac21 {

    public static void main(String[] args){
        degree d = new degree();
        d.getdegree();
        undergraduate u = new undergraduate();
        u.getDegree();
        postgraduate p = new postgraduate();
        p.getDegree();
        
        System.out.println("\n23DCS081 Mahi patel");
    }
    
}
