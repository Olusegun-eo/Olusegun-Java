package playGround.ClassWork;

public class Item {
    private double price;
    private int quantity;
    private String itemDescription;


    public Item(int price, int quantity, String itemDescription) {
        this.price = price;
        this.quantity = quantity;
        this.itemDescription = itemDescription;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price + "\t\t" +
                ", quantity=" + quantity + "\t\t" +
                ", item= " + itemDescription + "\t\t" +
                "Total " + this.calculate_Total();

    }

    public double calculate_Total(){
        return price * quantity;
    }

    public void printMethods(){
        System.out.println("Items" + itemDescription + "\t\t"
                + "Quantity" + quantity +
                "\t\t" + "Price" + quantity +
                "\t\t" + calculate_Total());
    }
}