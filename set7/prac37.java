public class prac37 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}

class Buffer {
    private int[] buffer;
    private int size;
    private int count;

    Buffer() {
        size = 5;
        buffer = new int[size];
        count = 0;
    }

    public synchronized void produce(int item) {
        while (count == size) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        buffer[count] = item;
        count++;
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int item = buffer[count - 1];
        count--;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.produce(i);
        }
    }
}


class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.consume();
        }
    }
}