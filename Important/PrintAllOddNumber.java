package Important;

import java.util.Scanner;

public class PrintAllOddNumber {
//    An integer's parity is odd when divided by two with the remainder is 1

    private static int minNumber;
    private static int maxNumber;


    public static void main(String[] args) {
        oddNumber();
    }

    private static void oddNumber() {
        System.out.println("Welcome to Program print odd Numbers within A RANGE");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the minimum number:   ");
        minNumber = scanner.nextInt();

        System.out.println("Enter the minimum number:   ");
        maxNumber = scanner.nextInt();
        for (int number = minNumber; number <= maxNumber; number++) {
            if(isOddNumber(number))
            System.out.println(number);
        }
    }

    private static boolean isOddNumber(int number) {

        for (int count = minNumber; number % count == 0; count++) {
            if(number <= maxNumber) {
                return false;
            }
        }
        return true;
    }


}


/*

        Here is how you can create an array of 10 employee objects,
        with a parameterized constructor :

public class MainClass
{
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        //step1 : first create array of 10 elements that holds object addresses.
        Emp[] employees = new Emp[10];
        //step2 : now create objects in a loop.
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i+1);//this will call constructor.
        }
    }
}

class Emp{
    int eno;
    public Emp(int no){
        eno = no;
        System.out.println("emp constructor called..eno is.."+eno);
    }
}
*/




