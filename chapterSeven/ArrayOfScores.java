package chapterSeven;

import java.util.Scanner;

public class ArrayOfScores {
    private static int userResponse;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        userResponse =scanner.nextInt();

        int[] scores = new int[userResponse];
        for(int i=0; i<userResponse; i++) {
            System.out.println("Enter the elements of the array: " +(i+1));
            scores[i]=scanner.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i=0; i<userResponse; i++) {
            System.out.println(scores[i]);
        }
        System.out.println();

        System.out.println(" The total score is: " +totalScore(scores));
        calculateSmallestNumber(scores);
        System.out.println(" The largest score is: " +calculateLargestNumber(scores));
        System.out.println(" The total average score is: " +calculateTotalAverage(scores));
    }

    private static int totalScore(int[] score) {
//        int[] scores = new int[0];
        int totalScore = 0;
        for (int i = 0; i < score.length; i++) {
            totalScore += score[i];
        }
        return totalScore;
    }

    private static void calculateSmallestNumber(int[] scores) {
        int smallestNumber = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(smallestNumber > scores[i]){
                smallestNumber = scores[i];
            }
        }
//        return smallestNumber;
        System.out.println("The smallest score is: " + smallestNumber);
    }

    private static double calculateLargestNumber(int[] scores) {
        int largestNumber = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(largestNumber < scores[i]){
                largestNumber = scores[i];
            }
        }
        return largestNumber;
    }

    private static double calculateTotalAverage(int[] scores) {
        return  (double) totalScore(scores) / userResponse;
    }
}

