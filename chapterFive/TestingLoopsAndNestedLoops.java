package chapterFive;

public class TestingLoopsAndNestedLoops {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("i ");
            }
            System.out.println();
        }








/*
        for (int i = 1; i <=5; i++) {
            for (int j = i; j <=5 ; j++) {
                System.out.println(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/



        //This is dicy
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=i; j++)
                System.out.println("Six");
        }


        //All of the statements in the outer loop s' body are body are executed 5 times.
        // The inner loop runs 10 times for each of those 5 times for a total of 50 numbers printed.

        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }


        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //THis is dicy
        for (int i = 1; i <=6; i++) {
            for (int j = 1;  j <= i-3; j++) {
                System.out.print("i ");
            }
            System.out.println();
        }
    }
}
