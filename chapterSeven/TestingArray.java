package chapterSeven;

import java.util.Scanner;

public class TestingArray {


    private static int noOfRow, noOfCol, countNoOfRow, countOfCol;

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("no of row");
            noOfRow = input.nextInt();
            System.out.println();

            System.out.println("no of row");
            noOfCol = input.nextInt();
           int[] [] arrayOfScores = new int[noOfRow] [noOfCol];


            supplyElements(arrayOfScores);
            displayElements(arrayOfScores);
        }



    public static void supplyElements(int a[][]){
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the Elements of noOfRow * noOfCol Matrix :");
            for(countNoOfRow=0; countNoOfRow<noOfRow; countNoOfRow++) {
                for(countOfCol=0; countOfCol <noOfCol; countOfCol++) {
                    a[countNoOfRow][countOfCol] = input.nextInt();
                }
            }
        }

        public static void displayElements(int a[][]){
            System.out.println("Elements in Matrix from are :");
            for(countNoOfRow=0; countNoOfRow<noOfRow; countNoOfRow++) {
                for(countOfCol=0; countOfCol<noOfCol; countOfCol++) {
                    System.out.print(a[countNoOfRow][countOfCol] + " ");
                }
                System.out.println();
            }
        }
    }
