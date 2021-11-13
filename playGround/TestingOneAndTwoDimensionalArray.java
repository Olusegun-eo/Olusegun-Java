package playGround;

import java.util.Scanner;

public class TestingOneAndTwoDimensionalArray {

    public static void main(String[] args) {
        //Scanner object to allow user input
        Scanner scanner = new Scanner(System.in);


        //This array will store the names of the students
        String [] names = new String [3];
        int i;

        //This 2D array will store the 3 project scores
        int [][] scores = new int[3][2];

        System.out.println("Enter studnt names");
        for (i = 0; i < names.length; i++) {
            System.out.println("Students " + (i+1)+ ": ");
            names[i] = scanner.nextLine();

        }




        //Ask user to enter the corresponding project scores

        System.out.println("Enter the 3 project "
                + "scores for each student: ");

        for (int row = 0; row < scores.length; row++)
        {
            for ( i = 0; i < names.length; i++)
            {
                for (int col = 0; col < scores[row].length; col++)
                {
                    System.out.print(names[i] + " Test "
                            + (col +1) + ": ");
                    scores[row][col] = scanner.nextInt();
                }
            }
            break;
        }





        //PRINT NAMES AND SCORES SIDE BY SIDE
        //MAKE TABLE HEADING HERE
        for (int row = 0; row < scores.length; row++)
        {
            for ( i = 0; i < names.length; i++)
            {
//                System.out.println(names[i] + " grades: ");
                System.out.println(( names[i] + "\t" + (i+1) + ". " + scores[i]));
//                System.out.println( names[i] + " : " + scores[i][0] + ", " + scores[i][1] + ", " + scores[i][2]);
                for (int col = 0; col < scores[row].length; col++)
                {
                    System.out.print(scores[row][col] + " ");
                }
                System.out.println();
            }break;
        }
    }

}






