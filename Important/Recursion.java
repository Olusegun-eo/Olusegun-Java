package Important;

import java.util.Scanner;

public class Recursion {

//    The process of calling a method repeatedly
//    When a Method calls itself continuously: The method is said to be recursive method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times do you want this to be repeated? ");

        try{
            int input = scanner.nextInt();
            System.out.println("Hello, This is recursion. This will print Sum " + input+ "times");
            methodAddition(input);
        }catch(Exception exception){
            System.out.println("Invalid input, please enter a valid figure");
        }
    }



    private static void methodAddition(int countNumberRepetitions) {
        int variableOne = 4;
        int variableTwo = 8;
        int sum = variableTwo + variableOne;
        if (countNumberRepetitions > 0) {
            System.out.println(sum);
            countNumberRepetitions--;
            methodAddition(countNumberRepetitions);
        }

    }




}
