class thread1 extends Thread{
    public void run(){
        System.out.println("Hello world");
    }
}

class thread2 implements Runnable{
    public void run(){
        System.out.println("hello world runnable interface");
    }
}

public class prac32 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        Thread t2 = new Thread(new thread2());
        t2.start();
        System.out.println("23DCS081 Mahi patel");
    }
}
