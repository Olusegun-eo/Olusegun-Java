package chapterFive;

public class TrianglePrintingProgram {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            //I created more space to the right
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int j = 1; j <= i ; j++)
                System.out.print('*');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int k = 10; i < k + 1; k--) {
                System.out.print('*');
//                System.out.print(' ');
    //                for (int j = 0; j < i; j++) {
    //                    System.out.print('*');
    //                }
            }
            System.out.println();
        }
    }
}
/*
    THIS ALSO WORKS FOR PATTERN A
        for (int i = 10; i >= 1; i--) {

            for (int j = 10; j > i; j--)
                System.out.print('*');
            System.out.println();
        }
*/




    /*
    This Also works for Patter A
  for (int i = 10; i >= 1; i--) {

            for (int j = 10; j > i-1 ; j--)
                System.out.print('*');
            System.out.println();
        }
        */

        /*
        Second Patter---A
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

    This works for A
      for (int i = 10; i >= 1; i--) {

            for (int j = 10; j > i; j--)
                System.out.print('*');
            System.out.println();
        }



    First Patter ---B

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }

THIS WORKS FOR B AS WELL
 for (int i = 10; i >= 1; i--) {
            for (int j = 10; j <= i+9; j++)
                System.out.print('*');
            System.out.println();
        }

                 for (int i = 1; i <= 10; i++) {
                  for (int j = 0; j <= 4; j++)
                        System.out.print('@');
                    System.out.println();
                }
            }


            //FOR SLANT TRIANGLE

            for (int i = 10; i >= 0; i--) {
            for (int j = 1; j <= i + 10; j++)
                System.out.print(' ');
            for (int k = 0; k < i; k++) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }


        //THIS IS NORMAL TRIANGLE WITH FLAT SURFACE
         for (int i = 10; i >= 0; i--) {
            for (int j = 1; j <= i + 10; j++)
                System.out.print(' ');
            for (int k = 10; i < k; k--) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }

        //SLANT RECTANGLE
                for (int i = 10; i >= 0; i--) {
            for (int j = 1; j <= i + 10; j++)
                System.out.print(' ');
            for (int k = 10; i < k + i; k--) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }




        //I WANTED TO SHOW THE SPACE BETWEEN TWO PATTERN
        for (int i = 10; i >= 0; i--) {
            for (int j = 1; j <= i +10; j++)
                System.out.print('*');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int k = 10; i < k + i ; k--) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }


        //FIRST: RIGHT ANGLE TRIANGLE SPACE + INVERTED TRIANGLE
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i ; j++)
                System.out.print('*');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int k = 10; i < k; k--) {
                System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }


    //PATTERN A AND B INSIDE ONE THE SAME LOOP

            for (int i = 1; i <= 10; i++) {
            //I created more space to the right
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int j = 1; j <= i ; j++)
                System.out.print('*');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            System.out.print(' ');
            for (int k = 10; i < k + 1; k--) {
                System.out.print('*');
//                System.out.print(' ');
            }
            System.out.println();
        }


*/


/*

    PATTER D IS WORKING FINE

 for (int i = 1; i <= 10; i+=2) {
         System.out.print(' ');
         System.out.print(' ');
         for (int k = 9; i < k +1; k--)
        System.out.print(' ');

        for (int j = 1; j <=i; j++)
        System.out.print('*');
        System.out.print(' ');
        System.out.print(' ');
        System.out.print(' ');


 */