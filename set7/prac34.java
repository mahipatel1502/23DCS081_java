public class prac34 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); // Start the first thread
       
    }
}

class Thread1 extends Thread {
    public void run() {
        while (true) {
            int n = (int) (Math.random() * 100);
            System.out.println("Generated number: " + n);
            if (n % 2 == 0) {
                // Create and start Thread2 for even number
                new Thread2(n).start();
            } else {
                // Create and start Thread3 for odd number
                new Thread3(n).start();
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    private int n;

    Thread2(int n) {
        this.n = n;
        setName("EvenThread"); // Set a meaningful name
    }

    public void run() {
        System.out.println(getName() + ": Square of " + n + " is " + (n * n));
    }
}

class Thread3 extends Thread {
    private int n;

    Thread3(int n) {
        this.n = n;
        setName("OddThread"); // Set a meaningful name
    }

    public void run() {
        System.out.println(getName() + ": Cube of " + n + " is " + (n * n * n));
    }
}
