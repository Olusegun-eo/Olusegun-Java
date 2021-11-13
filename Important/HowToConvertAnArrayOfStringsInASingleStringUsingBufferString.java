package Important;

import java.util.Arrays;

public class HowToConvertAnArrayOfStringsInASingleStringUsingBufferString {
//    How convert an array of Strings in a single String in java Using Buffer String


    public static void main(String[] args) {
        String [] strings = {"He", "has", "A", "Large", "My", "Said"};
        StringBuffer stringBuffer = new StringBuffer();

        for (int count = 0; count < strings.length; count++) {
            StringBuffer str = stringBuffer.append(Arrays.stream(strings).count());
            System.out.print(str.toString());
        };
        System.out.println();
    }
}

