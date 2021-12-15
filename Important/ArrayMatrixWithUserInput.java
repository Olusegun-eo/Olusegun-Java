package Important;

import java.util.Scanner;

public class ArrayMatrixWithUserInput {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number of matrix rows : ");
            int row = sc.nextInt();
            System.out.println("Please enter number of matrix columns : ");
            int col = sc.nextInt();
            // defining two dimensional array java
            int[][] numbers = new int[row][col];
            // filling java matrix
            fillingMatrix(sc, numbers, row, col);
            // printing 2d array in matrix form in java
            printingMatrix(numbers, row, col);
            replicate();
        }
        public static void fillingMatrix(Scanner scan, int num[][], int rows, int columns)
        {
            System.out.println("Please enter elements in matrix : ");
            for(int numberOfRows = 0; numberOfRows < rows; numberOfRows++)
            {
                for(int numberOfColumns = 0; numberOfColumns < columns; numberOfColumns++)
                {
                    num[numberOfRows][numberOfColumns] = scan.nextInt();
                }
            }
        }


        public static void printingMatrix(int num[][], int rows, int columns)
        {
            System.out.println("Printing 2d array in matrix form : ");
            for(int numberOfRows = 0; numberOfRows < rows; numberOfRows++)
            {
                for(int numberOfColumns = 0; numberOfColumns < columns; numberOfColumns++)
                {
                    System.out.print(num[numberOfRows][numberOfColumns] + "\t");
                }
                System.out.println();
            }
        }



        private static void replicate(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the length of column: ");
            int column =scanner.nextInt();
            System.out.println("Enter the length of row:    ");
            int row = scanner.nextInt();

            int [][] newArray = new int[column][row];

            for (int count = 0; count < row; count++){
                for (int i = 0; i < column; i++){
                    newArray[count][i] = scanner.nextInt();
                }
            }

            for (int count = 0; count < column; count++){
                for (int i = 0; i < column; i++){
                    System.out.print(newArray[count][i] + "\n");
                }
                System.out.println();
            }
        }

}


