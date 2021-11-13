package chapterEleven.MyersBriggs;

import java.util.ArrayList;
import java.util.Collections;

public class PrintArraySideWays {

    public static void main(String[] args) {
        PrintArraySideWays main = new PrintArraySideWays();
        main.addAll();

        //user input
        main.userInput();
        main.printAll();
    }

    ArrayList<String> originalR6 = new ArrayList<String>();
    ArrayList<String> userInputR6 = new ArrayList<String>();

    public void addAll() {
        //Our set list of characters
        Collections.addAll(originalR6,"nomad", "maverick", "lion");
    }

    public void userInput() {
        userInputR6.add("nomad");
        userInputR6.add("maverick");
        userInputR6.add("lion");
        //--------------
        // userInputR6.add("lion");
        // userInputR6.add("lion");
    }

    public void printAll() {
        System.out.println("    Quantity" + ""+ "\tPrice" + "" + "\tTotalAmount");
            for (int i = 0; i < originalR6.size(); i++) {

                System.out.println("Studnd: "+(i + 1) + ". " + originalR6.get(i) + "\t" + (i + 1) + ". " + userInputR6.get(i));
        }
        System.out.println();
    }
}
