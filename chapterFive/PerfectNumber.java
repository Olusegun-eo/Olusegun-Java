package chapterFive;

import java.util.Scanner;

public class PerfectNumber {
    private static int number;
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Supply a number: ");
        number = getInput.nextInt();

        for (int i = 1; i < number; i++) {
            if ((number % i) == 0)
                sum += i;
            }
            if (sum == number ) {
                System.out.printf("%s is a perfect number", number);
            } else {
                System.out.printf("%s is not a perfect number", number);
            }
    }
}
