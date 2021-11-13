package chapterNine.eStore;

public class ShippingAddress {

    @Override
    public String toString() {
        return "ShippingAddress{" +
                "address=" + address +
                '}';
    }

    public static void setRecipientName(String recipientName) {
        ShippingAddress.recipientName = recipientName;
    }

    public static String getRecipientName() {
        return recipientName;
    }

    private static String recipientName;
    private static String businessName;
    Address address;
    private static int suiteNumber;

    public ShippingAddress(Address address) {
        this.address = address;
    }


}
