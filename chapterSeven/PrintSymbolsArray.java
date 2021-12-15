package chapterSeven;

import java.util.Scanner;

public class PrintSymbolsArray {
    private static int userResponse;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of array");
        userResponse = scanner.nextInt();


        int [][] array = new int[userResponse][userResponse];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int sum = i+j;
               if(sum % 2 ==0){
                    System.out.print("X ");
                }
               else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
