package playGround;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Receipt {


    public static Double itemPrice;
    public static int itemQuantity;
    public static String itemName;
    public static String buyMore;


    public static ArrayList<String> itemDescription = new ArrayList<String>();
    public static ArrayList<Double> priceOfItem = new ArrayList<Double>();
    public static ArrayList<Integer> quantity = new ArrayList<Integer>();
    public static ArrayList<BigDecimal> totalAmount = new ArrayList<BigDecimal>();

    public static void main(String[] args){
        System.out.println("Welcome to Phamzy Store");
        repeatInput();
    }


    public static void customerDetail() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to by?    ");
        itemName = scanner.nextLine();
        itemDescription.add(itemName);

        System.out.print("How many many quantity?:  ");
        itemQuantity = scanner.nextInt();
        quantity.add(itemQuantity);

        System.out.print("What is the price of the item Per quantity?:   ");
        itemPrice = scanner.nextDouble();
        priceOfItem.add(itemPrice);

        BigDecimal total = new BigDecimal(itemQuantity * itemPrice);
         totalAmount.add(total);

        System.out.println("Would like to buy more?\t Enter yes to continue or no to exit  ");
        buyMore = scanner.next();

    }


    public static void repeatInput() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                buyMore = scanner.nextLine();
                if (buyMore != null)
                    buyMore = buyMore.trim();
                if (buyMore.equalsIgnoreCase("No")) break;
                customerDetail();
            }
        System.out.print("ItemList: "+itemDescription + "    " + "Price: "+ priceOfItem + "     " + "Quantity: " + quantity+ "     "+ "GHC "+ totalAmount);

    }
}
