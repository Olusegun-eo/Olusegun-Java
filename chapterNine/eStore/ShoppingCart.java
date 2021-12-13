package chapterNine.eStore;

public class ShoppingCart {

    ShoppingCart cart;
    private static int id;
    private static String cartId;
    private static String type;
    private static String idModel;

    public ShoppingCart(int id) {
        this.id = id;
        System.out.println("Welcome to home of variety");
    }


    public static String getCartId() {
        return cartId;
    }

    public static void setCartId(String cartId) {
        ShoppingCart.cartId = cartId;
    }
}
