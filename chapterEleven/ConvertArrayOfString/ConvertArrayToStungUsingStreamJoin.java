package chapterEleven.ConvertArrayOfString;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertArrayToStungUsingStreamJoin {

    public static void main(String[] args) {
        String [] stringsOfnumbers = {"One", "two", "Three", "Four", "Five", "Six"};

        String toStringByStream = Arrays.stream(stringsOfnumbers).collect(Collectors.joining());
        System.out.println(toStringByStream);
    }

}
