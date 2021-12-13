package playGround;

import java.util.Scanner;

public class InvoicePlayGround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Supply the list of Intended items? ");
        int userInput = scanner.nextInt();


        System.out.println("supply no of items");
        int itemQuantity = scanner.nextInt();
        String [] itemName = new String [userInput];
        int [] itemNumber = new int[itemQuantity];
        int i;
        for (i = 0; i < userInput; i++) {
            System.out.println("supply item name" + (i+1));
            String item = scanner.nextLine();
            itemName[i] += item;
            System.out.println(itemName[i]+ " "+ (1+i));
        }

        System.out.println("enter product quantity");
        for (int j = 0; j < itemQuantity; j++) {
            int noOfProduct = scanner.nextInt();
            itemNumber[i] += noOfProduct;
        }

        System.out.println( ""+ itemNumber[i]);
    }
}
