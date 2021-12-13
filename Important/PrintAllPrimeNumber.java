package Important;

import java.util.Scanner;

public class PrintAllPrimeNumber {

    private static int minValue;
    private static int maxValue;



    public static void main(String[] args) {
        primeFactor();

    }

    public static void primeFactor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to prime factors ");
//        boolean isNumber;
//
//       do {
//            if (scanner.hasNext()) {
//
//                System.out.println("Enter The minimum Value:    ");
//                minValue = scanner.nextInt();
//
//                System.out.println("Enter The maximum Value:    ");
//                maxValue = scanner.nextInt();
//
//                isNumber = true;
//            } else {
//                System.out.println("Enter a valid integer number");
//                isNumber = false;
//                scanner.nextInt();
//            }
//        }while(!(isNumber));

        System.out.println("Enter The minimum Value:    ");
        minValue = scanner.nextInt();

        System.out.println("Enter The maximum Value:    ");
        maxValue = scanner.nextInt();

        for (int number = minValue; number <= maxValue; number++) {
            if(isPrimeNumber(number)){
                System.out.println(number);
            }
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = minValue;  i <= number /i ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}