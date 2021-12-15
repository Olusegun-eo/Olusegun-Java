package chapterSeventeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStream {
    public static void main(String[] args) {
        Integer [] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

//        DISPLAY ORIGINAL VALUES
        System.out.printf("Original values : %s%n", Arrays.toString(values));
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                        .sorted()
                        .collect(Collectors.toList()));

//        Values greater than 4
        List<Integer> greaterThan4 = new ArrayList<>();
        Arrays.stream(values)
                .filter(value -> value > 4)
                .collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);
    }
}
