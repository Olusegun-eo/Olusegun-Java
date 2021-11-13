package chapterNine.eStore;

public class Address {

    private static String streetName;
    private static String city;
    private static String state;
    private static int houseNumber;
    private static String country;
    private static int postalCode;

    public Address(char[] password, String customerName, String streetName, String city, String state, String country, int postalCode) {

        Address.streetName = streetName;
        this.city = city;
        Address.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }


    public static String getStreetName() {
        return streetName;
    }

    public static void setStreetName(String streetName) {
        Address.streetName = streetName;
    }
}
