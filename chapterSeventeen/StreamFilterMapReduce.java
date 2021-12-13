package chapterSeventeen;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {

    public static void main(String[] args) {
        System.out.printf("Sum the triples of even numbers integers from 2 through 10 is : %d%n",
                IntStream.rangeClosed(1, 10)
                        .filter(x-> x % 2 == 0)
                        .map(x -> x *3)
                        .sum());
    }
}
