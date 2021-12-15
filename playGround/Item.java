package playGround;

import java.util.ArrayList;
import java.util.Scanner;

public class Item {

    private static String productName;
    private static float price;
    private static int quantity;
    private static double amount;
    private static String buyMore;


    public Item(String productName, int price, int quantity, double amount){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }


    public static void getProductName() {
        ArrayList<String> itemName = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy? ");
        productName = scanner.nextLine();
        itemName.add(productName);
            for (int count = 0; count < itemName.size(); count++){
                System.out.println(itemName.get(count));
            }
    }


    public static void getQuantityOfTheItem() {
        ArrayList<Integer> itemQuantity = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the quantity of the item? " );
        quantity = scanner.nextInt();
        itemQuantity.add(quantity);
        for (int countQuantity = 0; countQuantity < itemQuantity.size(); countQuantity++) {
            System.out.println(itemQuantity.get(countQuantity));
        }
    }


    public static Float getPriceOfEachItem(){
        ArrayList<Float> priceOfEachItem = new ArrayList<Float>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the cost of each Item? ");
        price = scanner.nextFloat();
        priceOfEachItem.add(price);
        int countPrice = 0;
        for (; countPrice < priceOfEachItem.size(); countPrice++) {
            System.out.println(priceOfEachItem.get(countPrice));
        }
        return priceOfEachItem.get(countPrice);
    }


    public static void calculatePrice() {
        ArrayList<Double> totalAmount = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate The Amount Of the Price");
        amount = price * quantity;
        totalAmount.add(amount);

        for (int countAmount = 0; countAmount < totalAmount.size(); countAmount++) {
            System.out.println(totalAmount.get(countAmount));
        }
    }


    public static void repeatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            buyMore = scanner.nextLine();
            if (buyMore != null)
                buyMore = buyMore.trim();
            if (buyMore.equalsIgnoreCase("No")) break;

            getProductName();
            getQuantityOfTheItem();
            getPriceOfEachItem();
            calculatePrice();

        }
//        System.out.println("ItemList: "+itemDescription + "    " + "Price: "+ priceOfItem + "     " + "Quantity: " + quantity+ "     "+ "GHC "+ totalAmount);

    }
}
