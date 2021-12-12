package chapterSeventeen;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayAndStream2 {

    public static void main(String[] args) {

        String [] strings = {"Red", "orange", "yellow", "green", "Blue", "indigo", "violet"};

//        DISPLAY ORIGINAL STRINGS
        System.out.printf("Original strings : %s%n", Arrays.asList(strings));

//        Display The Strings in Uppercase
        System.out.printf("strings in uppercase: %s%n", Arrays.stream(strings).map(String::toUpperCase)
                        .collect(Collectors.toList())
                        );

        // strings less than "n" (case insensitive) sorted ascending
         System.out.printf("strings less than n sorted ascending: %s%n", Arrays.stream(strings)
                 .filter( s -> s.compareToIgnoreCase("n") < 0)
                 .sorted(String.CASE_INSENSITIVE_ORDER)
                 .collect(Collectors.toList()));

        // strings less than "n" (case insensitive) sorted descending
         System.out.printf("strings less than n sorted descending: %s%n",
                 Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
                         .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                         .collect(Collectors.toList()));
    }
}
