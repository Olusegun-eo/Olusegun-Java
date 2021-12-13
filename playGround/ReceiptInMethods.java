package playGround;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ReceiptInMethods {

    public static Double itemPrice;
    public static int itemQuantity;
    public static String buyMore;


    public static ArrayList<String> itemDescription = new ArrayList<String>();
    public static ArrayList<Double> priceOfItem = new ArrayList<Double>();
    public static ArrayList<Integer> quantity = new ArrayList<Integer>();
    public static ArrayList<BigDecimal> totalAmount = new ArrayList<BigDecimal>();

    public static void main(String[] args){
        System.out.println("Welcome to Phamzy Store");
        repeatInput();

        calculateSubTotal();
    }



    public static void setItemDescription() {
        Scanner scanner = new Scanner(System.in);
        String itemName;
        System.out.print("What would you like to by?    ");
        itemName = scanner.nextLine();
        itemDescription.add(itemName);
    }

    public static void setItemQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many many quantity?:  ");
        itemQuantity = scanner.nextInt();
        quantity.add(itemQuantity);
    }

    public static void getItemPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the price of the item Per quantity?:   ");
        itemPrice = scanner.nextDouble();
        priceOfItem.add(itemPrice);
    }

    public static void setTotalAmount() {
        BigDecimal total = new BigDecimal(itemQuantity * itemPrice);
        totalAmount.add(total);
    }


    public static void customerDetail() {
        Scanner scanner = new Scanner(System.in);

        setItemDescription();
        setItemQuantity();
        getItemPrice();
        setTotalAmount();

        System.out.println("Would like to buy more?\t Enter yes to continue or no to exit  ");
        buyMore = scanner.next();

    }


    public static void calculateSubTotal(){
        BigDecimal discount;
//        BigDecimal subTotal = BigDecimal.valueOf(0.00);
        BigDecimal vat;
        double subTotal = 0.00;
        setTotalAmount();
        for (int countAmount = 0; countAmount < totalAmount.size(); countAmount++) {
            subTotal += countAmount;
        }
        System.out.println(subTotal);
    }

    /*
    ------------------------------
    sub Total,
    discount = 5/100  * totalAmount,
    VAT @ totalAmunt/discount
    ---------------------------------

    Bill Total,
    Tendered:,
    Balance;
    =================================
    Thank you
    =================================
    */


    public static void repeatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            buyMore = scanner.nextLine();
            if (buyMore != null)
                buyMore = buyMore.trim();
            if (buyMore.equalsIgnoreCase("No")) break;

            customerDetail();
        }
        System.out.println("ItemList: "+itemDescription + "    \n" + "Price: "+ priceOfItem + "     \n" + "Quantity: " + quantity+ "     \n"+ "GHC "+ totalAmount);
    }
}
