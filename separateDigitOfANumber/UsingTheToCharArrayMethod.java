package separateDigitOfANumber;

public class UsingTheToCharArrayMethod {



//    USING THE .toCharArray() method.
    /*
    Another way of separating the digits from an int number is
    using the toCharArray() method.

    1: We will convert the integer number into a string. 2: and then use the
    string’s toCharArray() to get the characters’ array.
    Now we can print out all the characters one by one.
    Later we can convert the characters back into the integer format.*/
    public static void main(String[] args) {

        int number = 123456;
        String convertToString = String.valueOf(number);

        char[] getEachCharacterOfString = convertToString.toCharArray();
        for ( char eachCharacter : getEachCharacterOfString){
            System.out.println("Each digit are: " + eachCharacter);
        }
    }
}
