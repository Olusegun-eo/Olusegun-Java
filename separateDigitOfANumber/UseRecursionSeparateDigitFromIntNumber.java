package separateDigitOfANumber;

public class UseRecursionSeparateDigitFromIntNumber {
    /*
    We can use the recursion technique to get the digits out of an int
    in a more straightforward way.

    The recursion() method takes the number as an argument and
    then calls itself by dividing the number with 10.
    It is the number of times the method will be called. */


    public static void main(String[] args) {

        recursive(3744833);


    }

    private static void recursive(int number) {
        if(number >0 ){
            recursive(number / 10);
            System.out.println(" "+ number % 10);
        }
    }
}
