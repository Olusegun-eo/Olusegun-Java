package chapterFive;

public class DiamonProgram {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i+=2) {
            System.out.print(' ');
            System.out.print(' ');
            for (int j = 10; i <= j; j--)
                System.out.print(' ');
            System.out.print(' ');

            for (int y = 1; y <=i ; y++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }

        for (int i = 1; i < 10; i += 2) {
            System.out.print(' ');
            System.out.print(' ');

            for (int j = 1; j <= i; j++)
                System.out.print(' ');
            System.out.print(' ');

            for (int k = 10; i <= k; k--) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }
    }

}