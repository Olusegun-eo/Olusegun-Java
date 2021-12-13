package chapterSeven;

import java.util.Scanner;

public class TableArrayMatrix {

    private static int noOfRow, noOfCol;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t \t Bus Station Reservation");
        System.out.println(""); //This is For spacing

        System.out.print("Supply no of row: ");
        noOfRow = scanner.nextInt();

        System.out.print("Supply no of col: ");
        noOfCol = scanner.nextInt();

        int [][] Matrix = new int [noOfRow][noOfCol];



        //Loop for column fields
        for (int column = 1; column < noOfCol; column++) {

            System.out.print("\t" + "Subject" + (column)+ " \t");
        }
        System.out.println();



        //Loop for Row fields
        for (int row = 0; row < noOfRow ; row++) {
//            System.out.print("Student" + (column)+ "| \t");
            System.out.print("\t" + "Student" + (row)+ " | \t");
            //for priting asteriks
            for (int col = 0; col <=4 ; col++) {

                Matrix[noOfRow][noOfCol]= scanner.nextInt();
                System.out.println(Matrix[noOfRow][noOfCol] + " \t\t");
            }
            System.out.println();
        }

    }
}
