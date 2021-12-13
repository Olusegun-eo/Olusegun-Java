package Important;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an amount");
        int [] array = {2, 4, 5};

        try {
            double price = scanner.nextDouble();
            System.out.println(price);
            System.out.println(array[4]);
        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("invalid input, enter a valid amount"); OR
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (Exception exception){
            System.out.println(exception);
        }catch (Throwable e){
            System.out.println("");
        }

    }


}
