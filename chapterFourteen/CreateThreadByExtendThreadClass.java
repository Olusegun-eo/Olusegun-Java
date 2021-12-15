package chapterFourteen;

public class CreateThreadByExtendThreadClass extends Thread{

    public static void main(String[] args) {
        CreateThreadByExtendThreadClass main = new CreateThreadByExtendThreadClass();
        main.start();
        System.out.println("This is running outside Thread");
    }
    public void run() {
        System.out.println("This code run Threads code");
    }
}
