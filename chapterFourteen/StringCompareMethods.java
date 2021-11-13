package chapterFourteen;

public class StringCompareMethods {
    public static void main(String[] args) {

        /*
        HoW TO DEMONSTRATE STRING METHODS: equals, equalsIgnoreCase, compareTo
        and regionMatches and using the equality operator == to compare String objects
         */

        String string = new String("Hello Friend");
        String stringOne = "goodbye";
        String stringTwo = "HAPPY BIRTHDAY";
        String stringThree = "happy birthday";
        System.out.println(string);


        System.out.printf("string = %s%nstringOne = %s%nstringTwo = %s%nstringThree = %s", string, stringOne, stringTwo, stringThree);
        System.out.println();

//        Test for equality

        if(string.equals("Hello friend")){
            System.out.printf("the input is equals to \"Hello Friend\"", string);
        }else{
            System.out.printf("the input does not match \"Hello Friend\"", string);
        }



        if(string == "Hello Friend"){
            System.out.println("The input is the same with \"Hello Friend\"");
        }else{
            System.out.println("The input mismacth");
        }

//        Test for Equality with ignore case

        if(stringTwo.equalsIgnoreCase(stringThree)){
            System.out.printf("The object is the same with %s", stringThree);
        }
        else{
            System.out.printf("The object is mismatch");
        }

//        Test compareTo

        System.out.printf("%nstring.compareTo(stringThree) is %d", stringTwo.compareTo(stringTwo));
        System.out.printf("%nstringTwo.compareTo(stringThree) is %d", stringTwo.compareTo(stringThree));
        System.out.printf("%nstringTwo.compareTo(stringThree) is %d", stringTwo.compareTo(stringThree));

        
//        regionMatches Case sensitive

        if( stringTwo.regionMatches(0, stringThree, 0, 5)){
            System.out.printf("The first 5 characters of %s matches %s", stringTwo, stringThree);
        }else{
            System.out.println("The input does not match");
        }
    }
}
