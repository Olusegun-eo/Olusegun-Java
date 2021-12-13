package chapterFive;

import java.util.Scanner;

public class SumOddIntegersChapFive3a {

    private static int count = 1;
    private static int sum;
    private static int number;

    public static void main(String... args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Supply a valid number ");
        number = input.nextInt();

            for (int count = 1; count <= number; count += 2) {
                    sum += count;
                System.out.println(' ');
                System.out.println(count + ", " + sum + ", "+ number);
            }
    }
}

/*
    Write a Java statement or a set of Java statements to accomplish each of the following tasks:
        a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
        variables sum and count have been declared.
        b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
        c) Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
        that the variable i has been declared, but not initialized. Print only five integers per line. [Hint: Use the calculation i % 5. When the value of this expression is 0, print a newline character; otherwise, print a tab character. Assume that this code is an application. Use the System.out.println() method to output the newline character, and use the Sys- tem.out.print('\t') method to output the tab character.]
        d) Repeat part (c), using a for statement.

 */