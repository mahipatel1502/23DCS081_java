
class currency{
 
    void convert(float p){
    
    float rupee = p*100;
    
    System.out.println("rupee :" + rupee);
    
    }
    }
    
    public class prac12{
    
    public static void main(String[] args){
    
    float p = Float.parseFloat(args[0]);
    String s = args[1];
    int i = Integer.parseInt(args[2]);
    
    currency p1 = new currency();
    System.out.println("pound :"+p);
    System.out.println(s);
    System.out.println(i);
    
    p1.convert(p);
    
    System.out.println("23DCS081 Mahi patel");
    
    }
    
    }
    
    