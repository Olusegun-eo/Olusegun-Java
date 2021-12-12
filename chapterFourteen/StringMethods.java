package chapterFourteen;

public class StringMethods {
    //    length=====> returns length of a String,
    //    charAt====>character at a specific location in a String
    //    getChars=====>retrieve a set of characters from a String as a char array

    public static void main(String[] args) {

        String string = "Hello String";
        char[] charArray = new char[12];


//        System.out.println((charArray.length));
        System.out.printf("String: %s", string);
        System.out.println();
//        Test for The String length
        System.out.printf("StringLength: %d", string.length());

        System.out.println();
        // loop through characters in string with charAt and display reversed
        for (int i = 0; i < string.length(); i++) {
            System.out.println("Each Character is: " + string.charAt(i));
        }

        // loop through characters in string with charAt and display reversed
        for (int count = string.length()-1; count >=0 ; count--) {
            System.out.printf(" %s", string.charAt(count));
        }

        System.out.println();
        // copy characters from string into charArray
        string.getChars(0,10, charArray, 0);//get Charac frm string, start @index0, end@indx10| to charArry bein@index0
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }

//        OR

        for (char character : charArray ){
            System.out.print(character);
        }
    }
}
