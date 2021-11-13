package javaArray;

public class Main {

    /*
    Java Array
    In Java, Array is a collection of items in which items are ordered.
    Array is immutable, meaning, we cannot add or remove elements from an array.
    E.g an array of integers assigned to a variable arr is>>>: int arr[] = {2, 4, 6};
    An array of strings is: >>>>> String arr[] = {"apple", "banana", "cherry"};

   To initialize an array, we can assign the array variable with
    new array of specific size as shown below.
    arrayDataType[] arrayName  =  new dataType [size]

   e.g
    int arr[] = {2, 4, 6};
    An array of strings is String arr[] = {"apple", "banana", "cherry"};
     */


//    In the following program, we initialized an integer array with a size of 10.

        public static void main(String[] args) {


        }


        public void declareAndInitializeArraySeparately() {
            int numbers[];
            numbers = new int[10];
        }

//    But you can combine the declaration and initialization,
//    to form the definition of array, as shown below.

        public void declareAndInitializeArray() {
            int numbers[] = new int[10];
        }


        public void declareAndInitializeAndAssignElementsToArray(){
                int[] numbers = {2, 4, 6, 8, 10};
        }

//        How to access Array Elements?  >>>>>   arrayName[index]
        public void howToAccessArrayElement(){
            int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
            int n = numbers[4];
            System.out.println("Element at index=4 is : " + n);//OUTPUT = 10
        }

//    we are updating the element of array at index 4.

    public void updateElementOfArray() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        numbers[4] = 25;
        int n = numbers[4];
        System.out.println("Element at index=4 is : " + n);//OUTPUT = 25
    }

//    how do we access elements of an array one by one in a loop? Well! Java has looping statements


    public void iterateThroughElementOfArrayOneByOne() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index=4 is : " +  numbers[i]);//OUTPUT = 25
        }
    }
}

