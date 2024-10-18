import java.util.Scanner;

public class prac33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number N (total numbers to sum): ");
        int N = scanner.nextInt();
        
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();
        
        int sum = 0;
        Thread[] threads = new Thread[numThreads];
        Summation.sum = new int[numThreads]; // Initialize the shared sum array
        
        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Summation(N, i, numThreads));
            threads[i].start();
        }
        
        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Aggregate the partial sums
        for (int i = 0; i < numThreads; i++) {
            sum += Summation.sum[i];
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("23dcs081 Mahi patel");
    }
}

class Summation implements Runnable {
    static int[] sum; // Shared array for partial sums
    int N, start, numThreads;
    
    Summation(int N, int start, int numThreads) {
        this.N = N;
        this.start = start;
        this.numThreads = numThreads;
    }
    
    @Override
    public void run() {
        for (int i = start + 1; i <= N; i += numThreads) {
            sum[start] += i; // Add numbers in the range handled by this thread
        }
    }
    
}