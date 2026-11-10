class NumberThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1 - Number: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Number Thread Interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class MessageThread extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 2 - Learning Java Multithreading");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Message Thread Interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class Task5_Multithreading {

    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        MessageThread t2 = new MessageThread();

        t1.start();
        t2.start();
    }
}