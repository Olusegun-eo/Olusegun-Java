package Important;

import java.util.Scanner;

public class RecursionTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how long do you want to go in meter/s?  ");

        try {
            int distance = scanner.nextInt();
            takeAWalk(0, distance);
        }catch (Exception exception){
            System.out.println("Invalid input, please enter a valid input   ");
        }
    }

    private static void takeAWalk(int number, int distance) {
        if(number < distance){
            System.out.println("The number of times you've walked is:  "+ number + "meter/s");
            number++;
            takeAWalk(number, distance);
        }else{
            System.out.println("you're done walking for the day");
        }
    }
}
