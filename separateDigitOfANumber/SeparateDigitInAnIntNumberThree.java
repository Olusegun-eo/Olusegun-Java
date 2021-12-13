package separateDigitOfANumber;

public class SeparateDigitInAnIntNumberThree {

//    number.split("(?<=.)") Method to Get the String Array and Then Split Them

    public static void main(String[] args) {
        int numbers= 37843844;

        String convertToString = String.valueOf(numbers);

        String[] splitNumberIntoDigit = convertToString.split("(?<=.)");

        for (String element: splitNumberIntoDigit){
            System.out.println("Each Digit:     " + element);
        }
    }

}
