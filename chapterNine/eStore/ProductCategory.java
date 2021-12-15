package chapterNine.eStore;

import java.util.Date;

public enum ProductCategory{
    ELECTRONICS(),
    GROCERIES(),
    UTENSILS(),
    CLOTHING();
    private static Date date;


//    ProductCategory(String model_Number, String product_number, Date date) {
//    }

    public static void displayProduct(){
        System.out.println("");
    }
}
