package chapterSeven;

import java.util.Scanner;

public class ArraysOfNumber {
    private static int noOfRow, noOfCol;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Input number of rows/columns (0 to exit)");
         noOfRow = sc.nextInt();
         noOfCol = sc.nextInt();
        System.out.println();
//                if(noOfRow==0)break;
         int [][] map = new int[noOfRow][noOfCol];

        displayResult(map);
        addElements(map);
        displayElements(map);
        displayEachScores(map);
    }

    public static void displayResult(int [][] map){
        Scanner sc = new Scanner(System.in);
        for(int countStudents = 0; countStudents < map[noOfRow].length; countStudents++){
            for(int j = 0; j<map[noOfCol].length; j++){
                map[countStudents][j] = sc.nextInt();
                map[countStudents][noOfRow] += map[countStudents][j];
            }
//            map[noOfRow][noOfRow] += map[noOfRow][noOfCol];
//            map[noOfRow][noOfRow] += map[countStudents][noOfRow];
//            map[countStudents][noOfCol] += map[noOfRow][noOfCol ];
        }

    }

    public static void addElements(int [][] map){
        for(int countStudents=0; countStudents<map[noOfRow].length; countStudents++){
            for(int j=0;j<map[noOfRow].length;j++){
                map[noOfRow][countStudents] += map[j][countStudents];
            }
        }
    }

    public static void displayElements(int [][] map){
        System.out.println("Result:");
        for(int countStudents=0; countStudents< map[noOfRow].length; countStudents++){
            for(int j=0;j< map[noOfRow].length;j++){
                System.out.printf("Student"+ (countStudents +1) + "%5d", map[countStudents][j] );
            }
            System.out.println();
        }
    }

    public  static void displayEachScores(int [][] map){
        System.out.println("Display Each scores :");
        for (int countStudents = 0; countStudents < map.length; countStudents++) {
            for (int j = 0; j < map.length; j++) {
                System.out.println(map[countStudents][j]);
            }
            System.out.println();
        }
    }
}

