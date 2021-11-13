package chapterSeven;

import java.util.Scanner;

public class TwoDimensionalArray {

        public static void main(String args[])
        {
            System.out.println("=".repeat(40));
            System.out.println("Welcome to Student record App");
            System.out.println("=".repeat(40));
            System.out.println();
            // initialize here.
            int numberOfStudents, numberOfSubjects, countStudents, countSubjects;
            Scanner scanner = new Scanner(System.in);

            // enter row and column for array.
            System.out.print("How many students do you have? : ");
            numberOfStudents = scanner.nextInt();
            System.out.print("How many subjects they do? : ");
            numberOfSubjects = scanner.nextInt();


            int scores[][] = new int[numberOfStudents][numberOfSubjects];
            // enter array elements.
            System.out.println("Enter " +(numberOfStudents*numberOfSubjects)+ " Scores Elements : ");
            for(countStudents = 0; countStudents < numberOfStudents; countStudents++)
            {
                for(countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++)
                {
                    scores[countStudents][countSubjects] = scanner.nextInt();
                }
            }

            // the 2D array is here.
            System.out.print("The Scores is :\n");
            for(countStudents = 0; countStudents < numberOfStudents; countStudents++) {
                System.out.print("Student"+(countStudents + 1)+":"+" ");
                for( countSubjects = 0; countSubjects < numberOfSubjects; countSubjects++)
                {
                    System.out.print("SUBJECT"+(countSubjects + 1) +":"+ " ");
                    System.out.print(scores[countStudents][countSubjects]+ "  ");
                }
                System.out.println();
            }

            System.out.println();
//            Max and Min scores of Each Subject
            System.out.print("The Maximum And Minimum scores are :\n");
            for(countSubjects = 0; countSubjects <= numberOfSubjects - 1; countSubjects++) {
                int min = scores[0][countSubjects];
                int max = scores[0][countSubjects];
                for( countStudents = 1; countStudents <= numberOfStudents -1; countStudents++)
                    if (scores[countStudents][countSubjects] < min) {
                        min = scores[countStudents][countSubjects];
                    } else if (scores[countStudents][countSubjects] > max) {
                        max = scores[countStudents][countSubjects];
                    }
                {
                    System.out.println("SUBJECT"+(countSubjects + 1) +":"+ "The minimum is: " + +min + ", The maximum is: " + max);
//                    System.out.print(scores[countStudents][countSubjects]+ "  ");
                }
                System.out.println();
            }
        }
    }

