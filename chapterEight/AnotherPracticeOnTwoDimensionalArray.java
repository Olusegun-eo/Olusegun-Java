package chapterEight;

import java.util.Scanner;

public class AnotherPracticeOnTwoDimensionalArray {

    static int numberOfStudents, numberOfSubjects;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\t"+ "=".repeat(60));
        System.out.println("\t\t\t\t\t\t"+ "\t\t" +"Welcome     to      Student     Record      Application");
        System.out.println("\t\t\t\t\t\t\t" + "=".repeat(60));
        System.out.println();


        System.out.print("How many number of subject they do? ");
        numberOfStudents = scanner.nextInt();

        System.out.print("How many number of subject they do? ");
        numberOfSubjects = scanner.nextInt();
        System.out.println();



        int[][] arrayOfScores = new int[numberOfStudents][numberOfSubjects];

        createArrayOfScores(arrayOfScores);
        displayScores(arrayOfScores);
        sumOfStudentByRow(arrayOfScores);
    }



    //Method responsible for creating Array of scores
    private static void createArrayOfScores(int[][] arrayOfScores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " +(numberOfStudents*numberOfSubjects)+ " Scores : ");
        for (int countStudent = 0; countStudent < arrayOfScores.length; countStudent++) {
            System.out.print("row: " + (countStudent)+ "   ".repeat(2));
            for (int countSubject = 0; countSubject < arrayOfScores[countStudent].length; countSubject++) {
                System.out.print("col: "+ (countSubject)+ " =  ");
                arrayOfScores[countStudent][countSubject] = scanner.nextInt();
            }
        }
    }

    //Method responsible for display collect scores collected
    public static void displayScores(int [][] arrayOfScores){

        System.out.println("Matrix Form ");
        System.out.println();
        System.out.println("=".repeat((int)Math.pow(numberOfStudents,numberOfSubjects)));
        displaySubject(arrayOfScores);
        for (int countStudent = 0; countStudent < arrayOfScores.length; countStudent++) {
            System.out.println();
            System.out.println("-".repeat((int)Math.pow(numberOfStudents,numberOfSubjects)));
            System.out.print("Student "+(countStudent+1)+":" +"     " );
            for (int countSubject = 0; countSubject < countSubject; countSubject++) {

                System.out.print( arrayOfScores[countStudent][countSubject] + "        |           ".repeat(1));
            }
            System.out.println();
        }
    }


    //Method responsible for Generating Subjects
    public static void displaySubject(int [][] arrayOfScores) {
        for (int countStudent = 0; countStudent < numberOfSubjects; countStudent++) {
            System.out.print("\t\t"+ "Subject "+(countStudent+1)+ "\t");
            for (int countSubject = 0; countSubject < countSubject; countSubject++) {
            }
        }
        System.out.println();
    }


    public  static  void sumOfStudentByRow(int [][] arrayOfScores){

        int [][] sumByRow = new int[numberOfStudents][];
        for (int countStudent = 0; countStudent <= numberOfStudents - 1; countStudent++) {
            int sum = sumByRow[countStudent][0];
            int sumIndex = 0;
            for (int countSubject = 0; countSubject <= numberOfSubjects -1; countSubject++) {
//                sumByRow[countStudent] += arrayOfScores[countStudent][countSubject];
                System.out.println("The sum of row " + (countStudent + 1)+ ": " + sumByRow);
            }

        }
        System.out.println();

        for (int countStudent = 0; countStudent <= numberOfStudents - 1; countStudent++) {
            for (int countSubject = 0; countSubject <= numberOfSubjects -1; countSubject++) {
                System.out.println("The sum of row " + (countStudent + 1)+ ": " + sumByRow);
                System.out.print( sumByRow[countStudent][countSubject] + "        |           ".repeat(1));
            }

        }
        System.out.println();

    }

    public  static void sumOfStudentByColumn(int [][] arrayOfScores){
        for (int countStudent = 0; countStudent < arrayOfScores.length; countStudent++) {
            for (int countSubject = 0; countSubject < arrayOfScores[countStudent].length; countSubject++) {
                int sumByColumn = 0;
//                sumByColumn += arrayOfScores[countStudent][countSubject];
                System.out.println("The sum of row " + (countSubject + 1)+ ": " + sumByColumn);
            }
            System.out.println();
        }
    }



    public static void displayMatrix(int [][] arrayOfScores){
        for (int countStudent = 0; countStudent < arrayOfScores.length; countStudent++) {
            for (int countSubject = 0; countSubject < arrayOfScores[countStudent].length; countSubject++) {
                int sumByColumn = 0;
                sumByColumn += arrayOfScores[countStudent][countSubject];
                System.out.println("The sum of row " + (countSubject + 1)+ ": " + sumByColumn);
            }
            System.out.println();
        }
    }



    public static void averageByRow(int [][] arrayOfScores){
        for (int countStudent = 0; countStudent < arrayOfScores.length; countStudent++) {
            for (int countSubject = 0; countSubject < arrayOfScores[countStudent].length; countSubject++) {
                int sumByColumn = 0;
                sumByColumn += arrayOfScores[countStudent][countSubject];
                System.out.println("The sum of row " + (countSubject + 1)+ ": " + sumByColumn);
            }
            System.out.println();
        }
    }
}

