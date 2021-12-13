package chapterFourteen;

public class CreateThreadByImplementInterfaceRunnable implements Runnable {

    public static void main(String[] args) {
        CreateThreadByImplementInterfaceRunnable threading = new CreateThreadByImplementInterfaceRunnable();
        Thread thread = new Thread(threading);
        thread.start();
        System.out.println("This code run outside thread");
    }

    @Override
    public void run() {
        System.out.println("This code run thread code");
    }
}
