package chapterFive;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        int totalScore =0;

        System.out.println("Supply a score or -1 to stop");
        score = input.nextInt();
        while (score != -1) {
            totalScore += score;
            System.out.println("Supply a score or -1 to stop");
            //Supply the number again--->It will go up to if it is -1
            //The following line is serving as the increament/ but Once the number is supplied
            //It goes up -->score != -1 for check
            score = input.nextInt();
        }
        System.out.printf("The totaScore is: ", totalScore);
    }
}
