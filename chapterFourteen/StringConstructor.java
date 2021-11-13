package chapterFourteen;

import java.util.Arrays;

public class StringConstructor {

    public static void main(String[] args) {
        char[] characterArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a' ,'y'};
        System.out.println(characterArray);
        System.out.println(Arrays.toString(characterArray));
        String string = new String("Hello, String!");

        String stringOne = new String(characterArray);


//        use String Constructors
        String string1 = new String(string);
        String string2 = new String(string1);
        String string3 = new String(stringOne);
        String string4 = new String(string);

//        System.out.println(string, stringOne);

        System.out.printf("string1 = %s%nstring2 = %s%nstring3 = %s%nstring4 = %s%nstring", string1, string2, string3, string4);
    }


//    length=====> returns length of a String,
//    charAt====>character at a specific location in a String
//    getChars=====>retrieve a set of characters from a String as a char array


}
