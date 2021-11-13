package chapterNine.eStore;

import java.util.ArrayList;

public class Customers extends User {

    private  ArrayList <BillingInformation> billingInformation;
    ShoppingCart shoppingCart;
    Address address;
    ShippingAddress shippingAddress;
    private static String customerName;
    private static int customerId;
    private static char [] password;


    public Customers(char[] password, String customerName) {
        this.password = password;
        Customers.customerName = customerName;
    }

    public Customers() {

    }

    public static String getCustomerName() {
        return customerName;
    }

    public static void setCustomerName(String customerName) {
        Customers.customerName = customerName;
    }


    public static int getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(int customerId) {
        Customers.customerId = customerId;
    }

}
