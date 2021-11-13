package chapterNine.eStore;

public class Products extends Item {
    private enum ProductCategory{};
    private static int productId;
    private static String productName;
    private static double price;
    private static String description;
//    private static String productCategory;

    public Products(int id) {
        super(id);
    }

}
