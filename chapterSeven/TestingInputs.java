//package chapterSeven;
//
//import java.util.Scanner;
//
//public class TestingInputs {
//<<<<<<< HEAD
//
//    private static int userNumberOfStudents, userNumberOfSubjects;
//
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to Student record App");
//        System.out.println();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How many students do you have? ");
//        userNumberOfStudents = scanner.nextInt();
//        System.out.println();
//
//        System.out.println("How many number of subject they do? ");
//        userNumberOfSubjects = scanner.nextInt();
//        System.out.println();
//
//
//        int [][] map = new int[userNumberOfStudents + 1][userNumberOfSubjects+1];
//        displayResult(map);
//        addElements(map);
//        displayElements(map);
//
//}
//
//    public static void displayResult(int [][] map){
//        Scanner sc = new Scanner(System.in);
//        for(int countStudents = 0; countStudents < userNumberOfStudents; countStudents++){
//            for(int countSubjects = 0; countSubjects < userNumberOfSubjects; countSubjects++){
//                map[countStudents][countSubjects] = sc.nextInt();
//                map[countStudents][userNumberOfStudents] += map[countStudents][countSubjects +1];
//            }
////            map[userNumberOfStudents][userNumberOfStudents] += map[userNumberOfStudents][userNumberOfSubjects];
////            map[userNumberOfStudents][userNumberOfStudents] += map[i][userNumberOfStudents];
//            map[countStudents][userNumberOfSubjects] += map[countStudents][userNumberOfSubjects ];
//        }
//
//    }
//
//    public static void addElements(int [][] map){
//        for(int countStudents=0; countStudents<userNumberOfStudents; countStudents++){
//            for(int countSubjects=0; countSubjects < userNumberOfStudents; countSubjects++){
//                map[userNumberOfStudents][countStudents] += map[countSubjects ][countStudents + 1];
//            }
//        }
//    }
//
//    public static void displayElements(int [][] map){
//        System.out.println("Result:");
//        for(int countStudents=0; countStudents< userNumberOfStudents+1; countStudents++){
//            for(int countSubjects=0; countSubjects < userNumberOfStudents+1; countSubjects++){
//                System.out.printf("%5d", map[countStudents][countSubjects]);
//            }
//            System.out.println();
//        }
//=======
//
//    private static int userResponse;
//        public static void main(String[] args) {
//            Scanner scanner=new Scanner(System.in);
//            System.out.print("Enter the number of elements you want to store: ");
//            userResponse =scanner.nextInt();
//
//            int[] scores = new int[userResponse];
//            for(int i=0; i<userResponse; i++) {
//                System.out.println("Enter the elements of the array: " +(i+1));
//                scores[i]=scanner.nextInt();
//            }
//
//            System.out.println("Array elements are: ");
//            for (int i=0; i<userResponse; i++) {
//                System.out.println(scores[i]);
//            }
//            System.out.println();
//
//            System.out.println(" The total score is: " +totalScore(scores));
//            System.out.println(" The smallest score is: " +calculateSmallestNumber(scores));
//            System.out.println(" The largest score is: " +calculateLargestNumber(scores));
//            System.out.println(" The total average score is: " +calculateTotalAverage(scores));
//        }
//
//    private static int totalScore(int[] score) {
//        int totalScore = 0;
//        for (int i = 0; i < score.length; i++) {
//            totalScore += score[i];
//        }
//        return totalScore;
//    }
//
//    private static double calculateSmallestNumber(int[] scores) {
//        int smallestNumber = scores[0];
//        for (int i = 0; i < scores.length; i++) {
//            if(smallestNumber > scores[i]){
//                smallestNumber = scores[i];
//            }
//        }
//        return smallestNumber;
//    }
//
//    private static double calculateLargestNumber(int[] scores) {
//        int largestNumber = scores[0];
//        for (int i = 0; i < scores.length; i++) {
//            if(largestNumber < scores[i]){
//                largestNumber = scores[i];
//            }
//        }
//        return largestNumber;
//    }
//
//    private static double calculateTotalAverage(int[] scores) {
//        return  (double) totalScore(scores) / userResponse;
//>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
//    }
//
//}
//
