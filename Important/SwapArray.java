package Important;

import java.util.Arrays;

public class SwapArray {

    public static int [] numbers = {4,-7,8,9,12,-1,0};

//This run for 83 times
    public static void main(String[] args) {
        sortingInAscendingOrder();
        System.out.println();
        sortingInDescendingOrder();
        System.out.println();
        fromLowestToTheHighest();
        System.out.println();
        fromHighestToTheLowest();
//        System.out.println();
//        anotherMethod();

    }

    //This run from lowest value to the Highest value
    public static void fromLowestToTheHighest(){
//        int [] numbers = {4,-7,8,9,12,-1,0};
//        int temp =0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] < numbers[j]) {
                   int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void fromHighestToTheLowest(){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void anotherMethod(){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >0 && numbers.length % 2 !=0 ) {
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
    
    public static void sortingInDescendingOrder(){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }



    public static void sortingInAscendingOrder(){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }

}
