package chapterFive;

import java.util.Scanner;

public class PrimeNumber {

    private static int number;
    private static int divisor =2;
    private static int prime;
//    private static int counter = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Supply a number: ");
        number = input.nextInt();

        if (number <= 1){
            System.out.print(number + "not a prime number");
        }
        for (; number > divisor; divisor++){
            if( number % divisor == 0) {
                System.out.print(number + " ");
            }

        }
    }
}

