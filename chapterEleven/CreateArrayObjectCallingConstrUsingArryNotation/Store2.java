package chapterEleven.CreateArrayObjectCallingConstrUsingArryNotation;

import chapterEleven.CreateArrayOfObject.Customer;

public class Store2 {

    public static void main(String[] args) {
        Customer[] customers = new Customer[]{new Customer(7777, "Gyanmat"),
                new Customer(889900, "Genepe"), new Customer(35363, "Grreg")
            };
            customers[0].display();
            customers[1].display();
            customers[2].display();
            }
}


