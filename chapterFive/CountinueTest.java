package chapterFive;

import java.util.Scanner;

public class CountinueTest {

    private static int number=1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("supply a number");
        number = input.nextInt();

        for (int i = 0; i < number; i++) {
            //Break the loop on Second iteration
           if (i == 5)
               break;
            System.out.printf("%d ", i ); //0 1 2 3 4 WHEN NUMBER 9

            /*

            //  continue to skip even numbers&&print primeNumbers
            if (i % 2 == 0)
//            if (i % 2 != 0)
                continue;
                System.out.printf("%d ", i); */
            }
        }
    }
