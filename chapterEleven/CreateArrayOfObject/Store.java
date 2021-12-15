package chapterEleven.CreateArrayOfObject;

public class Store {

    public static void main(String[] args) {
        Customer[] customers = new Customer[2];
        customers[0] = new Customer(709270, "Robert");
        customers[1] = new Customer(709219, "Neal");

        customers[0].display();
        customers[1].display();


        System.out.println();


        customers[0].display1();
    }
}
