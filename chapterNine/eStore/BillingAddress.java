package chapterNine.eStore;

public class BillingAddress {


    private static String cardName;
    private static Address address;

    public BillingAddress(Address address, String cardName) {
        BillingAddress.address = address;
        BillingAddress.cardName = cardName;
    }

    public static String getCardName() {
        return cardName;
    }

    public static void setCardName(String cardName) {
        BillingAddress.cardName = cardName;
    }



    /*    * Remove the credit card you're paying with from your wallet. Look on the front of the card for your name. ...
Type in the address attached to your credit card. Do not enter the shipping address. ...
Enter the country and state the billing address is located in. ...
Review the information.
    * */
}
