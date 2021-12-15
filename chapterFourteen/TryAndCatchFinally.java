package chapterFourteen;

public class TryAndCatchFinally {

    public static void main(String[] args) {
        try {
            int[] myNumber = {1, 2, 3, 4, 5};
            System.out.println(myNumber[10]);
        } catch (Exception e) {
            System.out.println("You're seeing this because of the indexOutOfBoundException");
        } finally {
            System.out.println("Finally, allows us to write code after try and catch");
        }
    }
}
