package chapterFive;

public class MagicNumber {

    public static void main(String[] args) {
        downPattern();
        upperPattern();
    }

    private static void upperPattern() {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("J ");
            }
            System.out.println();
        }
    }


    private static void downPattern() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("Six");
            }
        }
    }
}