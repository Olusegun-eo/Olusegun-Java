package Important;

import java.util.ArrayList;

public class HowToStoreUserDefinedObjectsIntoArrayList {
    public static void main(String[] args) {
        //create Array
        ArrayList<Book> books = new ArrayList<Book>();


        //Store the array here
        books.add(new Book("The concept Of Oop",  3, "Robert Segson", "2021-10-10"));
        books.add(new Book("Meyersbrbe",5, "Robert Fowler", "2001-01-01"));

        //Iterate to print the arrays
        for (Book str : books){
            System.out.println(" Name of the book: "+ str.nameOfTheBooks +"\n, And The Id is " + str.getId() +
                    "\n The author is:  " + str.authorName + "\n Year of publication is:   "+str.dateOfPublish);
        }
    }
}
