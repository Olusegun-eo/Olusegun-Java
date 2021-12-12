package chapterFourteen;

public class ConcurrencyInThread implements Runnable{
    public static int amount = 5;

    public static void main(String[] args) {
        ConcurrencyInThread concurrency = new ConcurrencyInThread();
        Thread thread = new Thread(concurrency);
        thread.start();
        //Wait for thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting....");
        }
        //We can now Update Amount and prints its value
        System.out.println("Main: "+ amount);
        amount++;
        System.out.println("Main: "+ amount);
    }

    @Override
    public void run() {
        amount++;
        System.out.println(amount);
    }
}
