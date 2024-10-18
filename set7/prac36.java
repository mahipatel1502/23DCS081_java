class T extends Thread
{
    public T(String s)
    {
        super(s);
    }
    @Override
    public void run()
    {
        System.out.println("This is run method :"+getName());
    }

} 
public class prac36 {     
    public static void main(String[] args) {
        T FIRST=new T("FIRST");    
        T SECOND=new T("SECOND");    
        T THIRD=new T("THIRD"); 
        
        System.out.println("defualt priority:");
        System.out.println("FIRST:"+FIRST.getPriority());
        System.out.println("SECOND:"+SECOND.getPriority());
        System.out.println("THIRD:"+THIRD.getPriority());

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);
        
        FIRST.start();
        SECOND.start();
        THIRD.start();
    }
}