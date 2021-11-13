package chapterEleven.MyersBriggs;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

    private static int numberOfStudents, numberOfSubjects, numberOfItmes;
    private static String name;
    public static String input ;
    public static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        invoiceHeader();
        formattedString();
//        total();

                System.out.print("How many number of items do you want to buy? ");
                numberOfItmes = scanner.nextInt();

                System.out.print("How many number of items they do? ");
                numberOfSubjects = scanner.nextInt();
                System.out.println();



                int[][] arrayOfScores = new int[numberOfItmes][numberOfSubjects];

                createArrayOfItems(arrayOfScores);
                displayItems(arrayOfScores);
            }

            private static void invoiceHeader() {
                System.out.println("\t\t\t\t\t\t\t"+ "=".repeat(40));
                System.out.println("\t\t\t\t\t"+ "\t\t" +"WELCOME     TO  LIZMAT    PHARMACY STORE");
                System.out.println("\t\t\t\t\t\t\t" + "=".repeat(40));
                System.out.println();
                System.out.println("LIZMAT PHARMACY");
                System.out.println("MAIN BRANCH");
                System.out.println("LOCATION  ");
                System.out.println("TEL    :0201457854");
                System.out.println("TIN:   ");
                System.out.println("Vat Reg. No.:     ");
                System.out.println();
                System.out.println("DATE    :" + setDateAndTime());
                System.out.println("CASHIER");
                System.out.println();
                System.out.println("=".repeat(200));
            }


            private static void formattedString(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("What is your name? ");
                name = scanner.nextLine();

                System.out.print("How many number of items do? ");
                numberOfItmes = scanner.nextInt();

                System.out.print("How many number of subject they do? ");
                numberOfSubjects = scanner.nextInt();
                System.out.println();
                System.out.println("=".repeat(60));
                System.out.println("-".repeat(60));
                System.out.println();
            }

            public static String setDateAndTime() {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd--MMM--yyy HH:mm:ss");
            String formattedDate = localDateTime.format(dateTimeFormatter);
            return formattedDate;
    }



    public static BigDecimal total(){
        Scanner scanner = new Scanner(System.in);
        int numberOfItems= 1; double inputPrice = 1; BigDecimal totalPrice = BigDecimal.valueOf(1);
        while (inputPrice > 0 && inputPrice !=0 && numberOfItems >0 && numberOfItems !=0){

            totalPrice = BigDecimal.valueOf(inputPrice * numberOfItems);

            System.out.println("How many quantity of the items bought");
             numberOfItems = scanner.nextInt();

            System.out.println("enter the price of the item");
            inputPrice = scanner.nextDouble();
        }
        return totalPrice;
    }

            //Method responsible for creating Array of scores
            private static void createArrayOfItems(int[][] arrayOfScores) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter " +(numberOfItmes*numberOfSubjects)+ " Scores : ");
                for (int countItems = 0; countItems < arrayOfScores.length; countItems++) {
                    System.out.print("row: " + (countItems)+ "   ".repeat(2));
                    for (int countSubject = 0; countSubject < arrayOfScores[countItems].length; countSubject++) {
                        System.out.print("col: "+ (countSubject)+ " =  ");
                        arrayOfScores[countItems][countSubject] = scanner.nextInt();
                    }
                }
            }

            //Method responsible for display collect scores collected
            public static void displayItems(int [][] arrayOfScores){

                System.out.println("Matrix Form ");
                System.out.println();
                System.out.println("=".repeat((int)Math.pow(numberOfStudents,numberOfSubjects)));
                displaySubject(arrayOfScores);
                for (int countItems = 0; countItems < arrayOfScores.length; countItems++) {
                    System.out.println();
                    System.out.println("-".repeat((int)Math.pow(numberOfStudents,numberOfSubjects)));
                    System.out.print("Items "+(countItems+1)+":" +"     " );
                    for (int countSubject = 0; countSubject < countSubject; countSubject++) {

                        System.out.print( arrayOfScores[countItems][countSubject] + "        |           ".repeat(1));
                    }
                    System.out.println();
                }
            }


            //Method responsible for Generating Subjects
            public static void displaySubject(int [][] arrayOfScores) {
                for (int countItems = 0; countItems < numberOfSubjects; countItems++) {
                    System.out.print("\t\t"+ "Quantity "+(countItems+1)+ "\t");
                    for (int countSubject = 0; countSubject < countSubject; countSubject++) {
                    }
                }
                System.out.println();
            }

            //Get user response
            private static void getUserResponse(){
        Scanner scanner = new Scanner(System.in);
                ArrayList<String> userResponse = new ArrayList<String>();
                System.out.println("Enter your items");
                while(scanner.hasNext()){
                    userResponse.add(scanner.next());
                }
                System.out.println(userResponse);
            }

            public static void inputNames(){
        Scanner scanner = new Scanner(System.in);

                System.out.println();
                System.out.println("Enter the name of items you bought");


            }
        }

