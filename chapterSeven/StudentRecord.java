package chapterSeven;

import java.util.Scanner;

public class StudentRecord {
<<<<<<< HEAD
    
    private static int numberOfStudents, numberOfSubjects;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Student record App");
        System.out.println();


        System.out.println("How many students do you have? ");
        numberOfStudents = scanner.nextInt();
        System.out.println();

        System.out.println("How many number of subject they do? ");
        numberOfSubjects = scanner.nextInt();
        System.out.println();


        int[][] arrayOfScores = new int[numberOfStudents][numberOfSubjects];
        

        supplyNumberOfStudents(arrayOfScores);
        displayScoresOfStudents(arrayOfScores);
//        displayScoresOfEachStudents(arrayOfScores);
//        getSmallestScore(arrayOfScores);
//        getHighestScore(arrayOfScores);
//        getTotalAverage(arrayOfScores);
//        displaySummaryOfResult(arrayOfScores);

    }

    private static void supplyNumberOfStudents(int[][] arrayOfScores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements of numberOfStudents * numberOfSubjects Matrix :");
         scanner.nextInt();
        for (int countStudents = 0; countStudents < numberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < numberOfSubjects ; countSubjects++) {
                  arrayOfScores[countStudents][countStudents] = scanner.nextInt();
            }
            System.out.println();
        }

    }

    public static void displayScoresOfStudents(int [][] arrayOfScores){
        System.out.println("Elements in the matrix from are: ");
        for (int countStudents = 0; countStudents < numberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++)
                System.out.print(arrayOfScores[countStudents][countSubjects] + " ");
        }
        System.out.println();
    }

}

/*
*
*
*
*
    public static void supplyNumberOfStudents(int[][] arrayOfScores){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements of numberOfStudents * numberOfSubjects Matrix :");
        System.out.println("Enter the elements of the array: " );
        int countStudents = 0, countSubjects = 0;

        for (; countStudents < arrayOfScores.length; countStudents++) {
            for (; countSubjects < arrayOfScores.length; countSubjects++)
                arrayOfScores[countStudents][countSubjects] = scanner.nextInt();
        }
    }

    public static void displayScoresOfStudents(int [][] arrayOfScores){
        System.out.println("Elements in the matrix form are: ");
        for (int countStudents = 0; countStudents < numberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++)
                System.out.print(arrayOfScores[countStudents][countSubjects] + " ");
            System.out.println();
=======

    private static int userNumberOfStudents, userNumberOfSubjects;

    public static void main(String[] args) {
        System.out.println("Welcome to Student record App");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students do you have? ");
            userNumberOfStudents = scanner.nextInt();
            System.out.println();

            System.out.println("How many number of subject they do? ");
            userNumberOfSubjects = scanner.nextInt();
            System.out.println();


            int[][] arrayOfStudents = new int[userNumberOfStudents][userNumberOfSubjects];


        supplyNumberOfStudents(arrayOfStudents);
        displayScoresOfStudents(arrayOfStudents);
        displayScoresOfEachStudents(arrayOfStudents);
        getSmallestScore(arrayOfStudents);
        getHighestScore(arrayOfStudents);
        getTotalAverage(arrayOfStudents);
        displaySummaryOfResult(arrayOfStudents);

    }

    public static void supplyNumberOfStudents(int[][] arrayOfStudents){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Elements of userNumberOfStudents * userNumberOfSubjects Matrix :");
        System.out.println("Enter the elements of the array: " );

        for (int countStudents = 0; countStudents < userNumberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < userNumberOfSubjects; countSubjects++)
                arrayOfStudents[countStudents][countSubjects] = scanner.nextInt();
        }
    }

    public static void displayScoresOfStudents(int [][] arrayOfStudents){
        System.out.println("Elements in the matrix form are: ");
        for (int countStudents = 0; countStudents < userNumberOfStudents; countStudents++) {
            for (int countSubjects = 0; countSubjects < userNumberOfSubjects; countSubjects++)
                System.out.print(arrayOfStudents[countStudents][countSubjects] + " ");
                System.out.println();
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
        }

    }

<<<<<<< HEAD
    public static void displayScoresOfEachStudents(int [][] arrayOfScores) {
        System.out.println("The scores of each student are: ");
        int countStudents = 0, countSubjects = 0;
        for (; countStudents < arrayOfScores.length; countStudents++) {
            for (; countSubjects < arrayOfScores.length; countSubjects++) {
                System.out.println(arrayOfScores[countStudents][countSubjects]);
=======
    public static void displayScoresOfEachStudents(int [][] arrayOfStudents) {
        System.out.println("The scores of each student are: ");
        for (int countStudents = 0; countStudents < arrayOfStudents.length; countStudents++) {
            for (int countSubjects = 0; countSubjects < arrayOfStudents.length; countSubjects++) {
                System.out.println(arrayOfStudents[countStudents][countSubjects]);
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
            }
            System.out.println();
        }
    }

<<<<<<< HEAD
    public static void getHighestScore(int [][] arrayOfScores){
        int largest = arrayOfScores[0][0];
        int countStudents = 1, countSubjects = 1;
        for (; countStudents < numberOfStudents; countStudents++) {
            for (; countSubjects < numberOfSubjects; countSubjects++) {
                if (arrayOfScores[countStudents][countSubjects] > largest)
                    largest = arrayOfScores[countStudents][countSubjects];
            }
            System.out.println("The Largest score is : " + largest);
        }
    }

    public static void getSmallestScore(int [][] arrayOfScores) {
        int smallest = arrayOfScores[0][0];
        int countStudents = 1, countSubjects = 1;

        for (; countStudents < numberOfStudents; countStudents++) {
            for (; countSubjects < numberOfSubjects; countSubjects++) {
                if (arrayOfScores[countStudents][countSubjects] < smallest)
                    smallest = arrayOfScores[countStudents][countSubjects];
=======
        public static void getHighestScore(int [][] arrayOfStudents){
            int largest = arrayOfStudents[0][0];
            for (int countStudents = 1; countStudents < userNumberOfStudents; countStudents++) {
                for (int countSubjects = 1; countSubjects < userNumberOfSubjects; countSubjects++) {
                    if (arrayOfStudents[countStudents][countSubjects] > largest)
                        largest = arrayOfStudents[countStudents][countSubjects];
                }
                System.out.println("The Largest score is : " + largest);
            }
        }

    public static void getSmallestScore(int [][] arrayOfStudents) {
        int smallest = arrayOfStudents[0][0];

        for (int countStudents = 1; countStudents < userNumberOfStudents; countStudents++) {
            for (int countSubjects = 1; countSubjects < userNumberOfSubjects; countSubjects++) {
                if (arrayOfStudents[countStudents][countSubjects] < smallest)
                    smallest = arrayOfStudents[countStudents][countSubjects];
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
            }
            System.out.println("The Smallest score is : " + smallest);
        }

    }

<<<<<<< HEAD
    public static void getTotalAverage(int [][] arrayOfScores) {

        int sum = 0;
        double totalAverage = 0;
        int countStudents = 1, countSubjects = 1;

        for (; countStudents < numberOfStudents; countStudents++) {
            for (; countSubjects < numberOfSubjects; countSubjects++) {
                sum += arrayOfScores[countStudents][countSubjects];
                totalAverage = (double) sum / arrayOfScores.length;
=======
    public static void getTotalAverage(int [][] arrayOfStudents) {

        int sum = 0;
        double totalAverage = 0;

        for (int countStudents = 1; countStudents < userNumberOfStudents; countStudents++) {
            for (int countSubjects = 1; countSubjects < userNumberOfSubjects; countSubjects++) {
                    sum += arrayOfStudents[countStudents][countSubjects];
                    totalAverage = (double) sum / arrayOfStudents.length;
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
            }
            System.out.println("The total Average score is : " + totalAverage);
        }

    }

<<<<<<< HEAD
    public static void inputNumberOfStudentsAndNumberOfSubjects(int [][] arrayOfScores){
        Scanner scanner = new Scanner(System.in);
        int countStudents = 0, countSubjects = 0;
        for (; countStudents < arrayOfScores.length; countStudents++) {
            for (; countSubjects < arrayOfScores[countStudents].length; countSubjects++) {
                arrayOfScores[countStudents][countSubjects] = scanner.nextInt();
                arrayOfScores[countStudents][countSubjects] += arrayOfScores[countStudents][countSubjects];
            }
            arrayOfScores[numberOfStudents][numberOfSubjects] += arrayOfScores[countStudents][numberOfStudents];
=======

        public static void inputNumberOfStudentsAndNumberOfSubjects(int [][] arrayOfStudents){
        Scanner scanner = new Scanner(System.in);
        for (int countStudents = 0; countStudents < arrayOfStudents.length; countStudents++) {
            for (int countSubjects = 0; countSubjects < arrayOfStudents[countStudents].length; countSubjects++) {
                arrayOfStudents[countStudents][countSubjects] = scanner.nextInt();
                arrayOfStudents[countStudents][countSubjects] += arrayOfStudents[countStudents][countSubjects];
            }
            arrayOfStudents[userNumberOfStudents][userNumberOfSubjects] += arrayOfStudents[countStudents][userNumberOfStudents];
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
        }

    }

<<<<<<< HEAD
    public static void displaySummaryOfResult(int [][] arrayOfScores){
        System.out.println("Result:");
//        inputNumberOfStudentsAndNumberOfSubjects(arrayOfScores);
        supplyNumberOfStudents(arrayOfScores);
        int countStudents=0, countSubjects=0;
        for(; countStudents<numberOfStudents+1; countStudents++){
            for(; countSubjects<numberOfSubjects+1;countSubjects++){
                System.out.printf("%5d", arrayOfScores[countStudents][countSubjects]);
            }
            System.out.println();
        }
*/
=======
    public static void displaySummaryOfResult(int [][] arrayOfStudents){
        System.out.println("Result:");
//        inputNumberOfStudentsAndNumberOfSubjects(arrayOfStudents);
        supplyNumberOfStudents(arrayOfStudents);
        for(int countStudents=0; countStudents<userNumberOfStudents+1; countStudents++){
            for(int countSubjects=0; countSubjects<userNumberOfSubjects+1;countSubjects++){
                System.out.printf("%5d", arrayOfStudents[countStudents][countSubjects]);
            }
            System.out.println();
        }
    }
}
>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
