package chapterEleven.MyersBriggs;

import java.util.ArrayList;
import java.util.Scanner;

public class MyersBriggsQuestionnaire {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t" + "=".repeat(45));
        System.out.println("\t\t\t\t\t" + "\t\t" + "Welcome   to   Myers-Briggs  Questionnaire");
        System.out.println("\t\t\t\t\t\t\t" + "=".repeat(45));
        System.out.println();



        System.out.println("S-N \tA\tB");
        int input = scanner.nextInt();
        ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>(input);
        for (int count = 1; count <= questions.size(); count++) {
            System.out.println(count + "\t" + questions.size());
        }
    }
}

