package Important;

import java.util.Scanner;

public class FindEvenNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int userInput = scanner.nextInt();


        for (int count = 0; count <=userInput; count++) {
            if (count % 2 == 0) {
                System.out.println("Number at index: "+(count+1)+"  is an Even Number: " + count);
            }
        }
    }
}