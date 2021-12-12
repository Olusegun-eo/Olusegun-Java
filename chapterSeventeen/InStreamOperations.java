package chapterSeventeen;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InStreamOperations {
    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.printf("Original values: ");
        System.out.println(IntStream.of(values).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());
        System.out.printf("Min: %d%n", IntStream.of(values).count());//not completed

        System.out.printf("%nSum via reduce method: %d%n", IntStream.of(values).reduce( 0, (x, y) -> x + y));
        System.out.printf("Product via reduce method: %d%n", IntStream.of(values).reduce( (x, y) -> x + y).getAsInt());
        System.out.printf("Sum of squares via map and sum : %d%n", IntStream.of(values).map(x-> x * x).sum());
        System.out.printf("Values displayed in sorted order: %d%n", IntStream.of(values).sorted().mapToObj(String::valueOf)
                .collect(Collectors.joining(" ") ));
    }
}