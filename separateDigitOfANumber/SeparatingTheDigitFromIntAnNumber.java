package separateDigitOfANumber;

import java.util.LinkedList;

public class SeparatingTheDigitFromIntAnNumber {

/*
    We can get every single digit of an integer number by
    using the remainder method. Java allows us to get the remainder
    of any integer number using the % (mod) operator.

    But merely getting the remainder will give us the result in
    the reverse order. It is why we will use a LinkedList stack.
    In which we will push every single reminder and then pop
    one by one, providing us with the desired result.
    */

    public static void main(String[] args) {
        tetsting();

        int number = 3748373;

        LinkedList<Integer> list = new LinkedList<Integer>();
        while (number > 0){
            list.push(number % 10);
            number /= 10;
        }
        while (!list.isEmpty()){
            System.out.println(list.pop());
        }
    }


    public static void tetsting(){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int number =832838329;

        while  ( number > 0){
            linkedList.push(number % 10);
            number = number / 10;

        }while(!linkedList.isEmpty()){
            System.out.println("Each Digit: " + linkedList.pop());
        }
}
}

