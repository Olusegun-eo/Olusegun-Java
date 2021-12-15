package chapterNine.eStore;

import java.util.ArrayList;

public class EStore {

    private ArrayList<User> users;

    public static void main(String[] args) {
        User [] users = new User[3];
        users[0] = new Customers();
        users[1] = new Admin();
        users[2] = new Seller();


        Customers customers = new Customers();
        System.out.println(customers.address);
    }

}

