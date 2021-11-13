package playGround;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToCheckIfNumberOFInputInArrayIsCorrect {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers of entry?: ");
        int noOEntry = scanner.nextInt();
        ArrayList<String> al = new ArrayList<>();
        String word = "";

        while (true) {
            for (int count = 0; count <noOEntry ; count++) {
                System.out.println("Entry " + (count+1));
                word = scanner.nextLine();
                al.add(word);
            }
            System.out.println(al);
            System.out.println();
            /*m
            word = scanner.nextLine();
            if (word != null) word = word.trim();
            if (word.equalsIgnoreCase("quit")) break;
            al.add(word);*/
        }
    }
}