package Important;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExampleOne {

   public static String input ;
   public static ArrayList list = new ArrayList();
   public static ArrayList<Integer> quantity =new ArrayList<Integer>();
   public static ArrayList<Double> price = new ArrayList<Double>();
   public static int numberOfItems;


    public static void main(String args[]) {
        loopingB();
//        methodOne();
        loopingA();
//        setPrice();
//        separate();
    }
//
//    public static void createTheArray(){
//        ArrayList<String> quetsions = new ArrayList<String>();
//    }

        public static void loopingA(){
            System.out.println("Welcome to Haphiz Store");
            Scanner sc = new Scanner(System.in);

            System.out.println("How many of Items would you buy?");
            numberOfItems = sc.nextInt();
            int countNameOfItems = 0;
            for (; countNameOfItems < numberOfItems; countNameOfItems++) {
                input = sc.next();
                System.out.print("Name OF Item "+ (countNameOfItems + 1)+": ");
                list.add(input);
            }
            System.out.print("List Of Items\t"+ list);
        }


    public static void methodOne(){
        ArrayList<String> arlist = new ArrayList<String>();


        arlist.add("JAVA");

        arlist.add("Csharp");

        arlist.add("Python");

        arlist.add("Php");

        arlist.add("Android");

        arlist.add("HTML");

        //Adding "C++" at the sixth position

        arlist.add(5, "C++");

        System.out.println(arlist);
    }


    public static void separate(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> arr = new ArrayList<Object>();
        while(scanner.hasNext())
        {
            arr.add(scanner.nextLine());
            System.out.print(arr.get(arr.size()-1));
        }
        System.out.println(arr);

    }


    public static void setQuantity() {
        /*
        for validation

        while (input.hasNextInt()) {
            integerList.add(input.nextInt());
            if (integerList.size() > 10)
                break;*/

        /*
        if (!(integerList.size() >= 5 && integerList.size() <= 10)) {
            throw new IllegalArgumentException("Received too many integers");
        }
        return integerList;*/

    }

    public static void setPrice() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many of Items would you buy?");
        numberOfItems = sc.nextInt();
        int countNumberOfPrice = 0;
        for (; countNumberOfPrice < numberOfItems; countNumberOfPrice++) {
            double pricePerItem = sc.nextDouble();
            System.out.print("Name OF Item "+ (countNumberOfPrice + 1)+": ");
            price.add(pricePerItem);
        }
        System.out.print("Price OF Items\t"+ price);
        
    }



    public static void setTotalAmount(ArrayList quantity, ArrayList price){
        setPrice();
        setQuantity();
        for (int eachNumberOfItem = 0; eachNumberOfItem < quantity.size(); eachNumberOfItem++) {

        }
    }






//For specified numbers of input====>Example
    public static void loopingB(){
        System.out.println("Testing for specified numbers of input");
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many?:  ");
        int numbas = scanner.nextInt();
        int count = 0;
        System.out.println("Please Enter name(s) of the item:   ");
        for (; count < numbas; count++) {
            list.add(scanner.nextLine().toString());
        }
        System.out.println("B\t"  + list);
    }
}




/*
   System.out.println(question.length);
           int count = 0;
           char userAnswer[];
           userResponse = new char[question.length];
           for (; count <question.length; count++) {
        userAnswer = new char[scanner.nextLine().toString().charAt(0)];
        System.out.println("Please make a choice");
        userResponse = userAnswer;
        System.out.println(userAnswer);
        System.out.println(question[count]);*/


