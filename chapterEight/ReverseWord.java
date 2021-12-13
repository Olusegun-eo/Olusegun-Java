package chapterEight;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Supply a name");
        String useResponse = scanner.next();


        for (int count = useResponse.length()-1; count >= 0; count--) {
            System.out.print(useResponse.charAt(count));


            /**
             * get input and store it
             *empty storage
             *romeve last element from userInput
             * store the removed element in empty storage until zeo index
             * reduce the the counter == index[1]ofStoredElements
             */
        }

    }
}
