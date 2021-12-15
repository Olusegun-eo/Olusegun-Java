package chapterSeven;

import java.util.Scanner;

public class IterateThroughColumns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"Welcome to Iterating through Columns\"" + "=".repeat(50));
        System.out.println();

        System.out.println("enter 1st number: ");
        int coloum = scanner.nextInt();
        System.out.println();


        System.out.println("enter 2nd number: ");
        int row = scanner.nextInt();
        System.out.println();

        int[][] input = new int[coloum][row];

//        for (int i = 0; i <= coloum - 1; i++) {
//            for (int j = 0; j <= row - 1; j++) {
//                input[i][j] = input[i][j];
//                System.out.println("Elements"  + " " + i + "," + j + "");
//
//            }
//        }

        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= coloum - 1; j++) {
                if (input[i][j] == (int) (input[i][j])) {
                    System.out.println("Find Whatever to print" + " " + i + ", " + j);
                }
            }
        }

        }
}