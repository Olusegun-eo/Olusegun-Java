package chapterSeven;

import java.util.Scanner;

public class AddNumbersOfRowsAndColumnsTesting {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println();
            System.out.println("Input number of rows/columns (0 to exit)");
                int noOfRow = sc.nextInt();
                int noOfCol = sc.nextInt();
//                if(noOfRow==0)break;
                int[][] map = new int[noOfRow+1][noOfCol+1];

                for(int i=0;i<noOfRow;i++){
                    for(int j=0;j<noOfCol;j++){
                        map[i][j] = sc.nextInt();
                        map[i][noOfRow] += map[i][j];
                    }
                    map[noOfRow][noOfRow] += map[i][noOfRow];
                }

                for(int i=0;i<noOfRow;i++){
                    for(int j=0;j<noOfRow;j++){
                        map[noOfRow][i] += map[j][i];
                    }
                }
                System.out.println("Result:");
                for(int i=0;i<noOfRow+1;i++){
                    for(int j=0;j<noOfRow+1;j++){
                        System.out.printf("%5d", map[i][j]);
                    }
                    System.out.println();
                }
            }

        public static void displayResult(){

        }
    }

