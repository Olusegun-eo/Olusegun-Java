package chapterSeventeen;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of the even numbers between 2 and20 is : %d%n",
                IntStream.rangeClosed(1, 10)//1...10
                        .map( (int x)-> {return x * 2;})//multiply by 2
                        .sum());//sum
    }
}
