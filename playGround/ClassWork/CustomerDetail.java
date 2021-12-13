package playGround.ClassWork;

import java.util.Scanner;

public class CustomerDetail {

    private static String buyMore;
    private static String customerName;
    public static Cart cart;


    public CustomerDetail(String customerName) {
        this.customerName = customerName;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Phamzy Store \n");
        System.out.println();

        setCustomerName();
        setTransactionDescription(cart);
        reCollectCustomersInput(cart);
    }

    public static void setCustomerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        customerName = scanner.nextLine();

    }

    public static void setTransactionDescription(Cart cart) {
        Scanner scanner = new Scanner(System.in);

        String itemName;
        System.out.println("Enter name of the item bought:\t    ");
        itemName = scanner.nextLine();

        System.out.println("Enter quantity of the item bought:\t  ");
        int itemQuantity = scanner.nextInt();
//        carts.add(carts.get(itemQuantity));

        System.out.println("Enter price item Per quantity?:   ");
        double itemPrice = scanner.nextDouble();
//        carts.add(cart);

        Item items = new Item((int) itemPrice, itemQuantity, itemName);

        cart.addEachItemsToItemList(items);


        System.out.println("Would you like to buy more?\t Enter  \"yes\" to continue or \"no\" to exit  ");
        buyMore = scanner.next();
    }


    private static void reCollectCustomersInput(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            buyMore = scanner.nextLine();
            if (buyMore != null)
                buyMore = buyMore.trim();
            if (buyMore.toLowerCase().equalsIgnoreCase("No")) break;
            setTransactionDescription(cart);
            buyMore = scanner.next();
        }
//        System.out.println("ItemList: "+ + "    \n" + "Price: "+ priceOfItem + "     \n" + "Quantity: " + quantity+ "     \n"+ "GHC "+ totalAmount);
    }

}
