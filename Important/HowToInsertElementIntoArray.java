package Important;

import java.util.Scanner;

public class HowToInsertElementIntoArray {


    public static void main(String[] args) {
        System.out.print("Welcome to Array INSERTION PROGRAM");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Supply size of the Array");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int value = 0;
        int max = 0;
        int position = 0;


        System.out.print("Supply six values for the arrays: ");
        for(int i = max; i <array.length; i++){
            array[i] = scanner.nextInt();
            System.out.println( array[i] );
        }
    }
}








//        System.out.println("Inserting values to any position of an Existing Array");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Supply a value: ");
//        int value = scanner.nextInt();
//
//        System.out.print("supply a value for location: ");
//        int location = scanner.nextInt();
//
//
//        System.out.print("Supply the size of the array: ");
//        int size = scanner.nextInt();
//
//        System.out.print("supply the index of the Element:  ");
//        int indexOfElement = scanner.nextInt();
//
//        int [] arrayOfElements = new int[size];
//
//
//        System.out.println("Supply your values to fill up the array");
//        for (indexOfElement = arrayOfElements.length; indexOfElement > location; indexOfElement--){
//            arrayOfElements[indexOfElement] = scanner.nextInt();
//            arrayOfElements[indexOfElement] = arrayOfElements[indexOfElement - 1];
//            System.out.println((arrayOfElements[indexOfElement]));
//        }
//    }