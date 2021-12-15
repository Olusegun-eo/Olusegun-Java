package chapterFive;

import java.util.Scanner;

public class DecimalEquivalentOfABinaryNumber {

    private static int count =1;
    private  static int sum;
    private static int number;

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.println("supply a binary number: ");
        number = input.nextInt();

        for(; count > 1;){

            sum += number;
            count++;
        }
    }
}
