package chapterSeven;

import java.util.Scanner;

public class StudentsArray {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=".repeat(40));
        System.out.println("Welcome to Student record App");
        System.out.println("=".repeat(40));
        System.out.println();


        System.out.print("How many students do you have?  ");
        int numberOfStudents;
        System.out.printf("The number of students is:  %5d", numberOfStudents = scanner.nextInt() );
        System.out.println();

        System.out.print("How many number of subject they do? ");
        int numberOfSubjects;
        System.out.printf("The number of subjects is:  %5d", numberOfSubjects = scanner.nextInt());
        System.out.println();


        int[][] arrayOfScores = new int[numberOfStudents][numberOfSubjects];

        // enter array elements
        for (int countStudents = 0; countStudents < numberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++) {
                arrayOfScores[countStudents][countStudents] = scanner.nextInt();
            }
            System.out.println();
        }

        System.out.println("Elements in the matrix from are: ");
        for (int countStudents = 0; countStudents < numberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++)
                System.out.print(arrayOfScores[countStudents][countSubjects] + " ");
        }
        System.out.println();
    }
}