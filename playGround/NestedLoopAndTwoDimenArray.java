package playGround;

public class NestedLoopAndTwoDimenArray {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int lengthOfRows = 0; lengthOfRows < array.length; lengthOfRows++) {
            for (int lengthOfColumns = 0; lengthOfColumns < array[lengthOfRows].length; lengthOfColumns++) {
                System.out.println(array[lengthOfRows][lengthOfColumns]);
            }
        }


    }
}