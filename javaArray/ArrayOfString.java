package javaArray;

import java.util.Scanner;


public class ArrayOfString {
    private static int minNumber;
    private static int maxNumber;


    public static void main(String[] args) {
        printPrimeNumbers();
    }



    public void declareArrayOfString(){
        String[] array = new String[5];
    }


    public void assignElementToString(){
        String[] nameOfFruits = {"Apple", "Orange", "Tea", "Tangerine", "Coffee"};
        nameOfFruits[4] = "Gregeg";
        String fruit = nameOfFruits[5] ;
        System.out.println("The 4th Element of array is: " + nameOfFruits[4]);
    }


//    Iterate Through The String OF Array
    public void iterateThroughElementOfArrayOneByOne() {
        String[] nameOfFruits = {"Apple", "Orange", "Tea", "Tangerine", "Coffee"};
        for (String fruit: nameOfFruits) {
            System.out.println(fruit);
        }
//        OR
        for (int fruit = 0; fruit < nameOfFruits.length; fruit++) {
            System.out.println(nameOfFruits[fruit]);
        }
//        OR
        int fruit = 0;
        while(fruit < nameOfFruits.length){
            System.out.println(nameOfFruits[fruit]);
            fruit++;
        }
    }


    public static void printPrimeNumbers(){
        System.out.println("Wecome to print All prime numbers ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number:   ");
         maxNumber = scanner.nextInt();

        System.out.println("Enter min number:   ");
         minNumber = scanner.nextInt();

        for (int number = minNumber; number < maxNumber; number++) {
            if(isPrimeNumbers(number)){
                System.out.println(number);
            }
        }


    }

    private static boolean isPrimeNumbers(int number) {
        for (int countTheNumber = minNumber; countTheNumber <= number/countTheNumber; countTheNumber++) {
            if ( number % countTheNumber == 0){
                return false;
            }
        }
        return true;
    }

}
