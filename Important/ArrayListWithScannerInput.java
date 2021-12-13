package Important;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListWithScannerInput {

   private static Scanner scanner = new Scanner(System.in);
   private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
   private static int userInput;

    public static void main(String[] args) {




//        for (int countUserInput = 0; countUserInput <= userInput; countUserInput++) {
//            System.out.println(array.get(countUserInput));
//        }


        writeIntoArray();
        readFromTheArray();
        deleteFromArray();
    }

    private static void writeIntoArray(){
        System.out.println("Please enter list of integers, and . to exit when you're done");
         userInput = scanner.nextInt();
        while ( userInput != 0 ){
            arrayList.add(userInput);
            userInput = scanner.nextInt();
        }
        System.out.println();
    }

    private static void readFromTheArray(){
        System.out.println("=".repeat(40));
        for (int countUserInput : arrayList) {
            System.out.println(countUserInput);
        }
        System.out.println();
    }

    private static void deleteFromArray(){
        System.out.println("What number would you like to delete? ");
        userInput = scanner.nextInt();
        for (int count = 0; count < arrayList.size(); count++) {
            if (arrayList.get(count) == userInput) {
                arrayList.remove(count);
                break;
            }
        }
        System.out.println();
//        To print the remaining array==>We call for the for it here
        readFromTheArray();
    }
}
