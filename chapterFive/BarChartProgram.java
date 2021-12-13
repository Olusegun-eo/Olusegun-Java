package chapterFive;

import java.util.Scanner;

public class BarChartProgram {

    private static int number =1;
    private static int counter = 1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Supply a number: ");
        number = input.nextInt();
            for (int count = 0; count <= number; count++) {
                for (int j = 1; j <= number; j++)
                    System.out.print('*');
                System.out.print(' ');
                number = input.nextInt();
                if (number >= 30) {
                    break;
//                    System.out.println("supply a valid number");
//                    number = input.nextInt();
                }
            }
            System.out.println();
        }
    }
