package chapterNine.eStore;

public class Item extends ShoppingCart {
    private static int quantityOfProduct;

    public Item(int id) {
        super(id);
    }

    public static int getQuantityOfProduct(){
        return quantityOfProduct;
    }

    public static void setQuantityOfProduct(int quantityOfProduct) {
        Item.quantityOfProduct = quantityOfProduct;
    }
}
