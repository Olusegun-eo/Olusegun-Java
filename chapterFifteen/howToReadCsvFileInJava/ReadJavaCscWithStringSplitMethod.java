package chapterFifteen.howToReadCsvFileInJava;

/*
Java String.split() method

The String.split() of Java identifies the delimiter and split the rows into tokens.

The Syntax of this method is:   public String[] split(String regex)
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadJavaCscWithStringSplitMethod {
//    public static final String delimiter = " ,";

    public static void main(String[] args) {
        String csvFile =  "C:\\Users\\USER\\Documents\\csvDemo.csv";
        read(csvFile);
        readTwo(csvFile);

    }

    public static void read(String csvFile){
        try{
            File file = new File(csvFile);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = " ";

            while ( (line = bufferedReader.readLine()) != null ) {
                String[] tempArray = line.split(" ,");

                for (String temp : tempArray) {
                    System.out.println(temp + " ");
                }
                System.out.println();
            }

            bufferedReader.close();
        }
        catch (IOException e){
            System.out.println("Something went wrong, the file does not exists");
            e.printStackTrace();
        }

    }



    public static void readTwo(String filename){
        try {
            File file = new File(filename);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String lineSpace = " ";

            while( (lineSpace = bufferedReader.readLine()) != null){
                String[] tempArray = lineSpace.split(" ;");

                for (String temp_array : tempArray){
                    System.out.println(temp_array + " ");
                }
                System.out.println("");
            }
            bufferedReader.close();
        }
        catch (IOException ioe){
            System.out.println("The file is not found: pls check the file location to be sure it's correct!");
            ioe.printStackTrace();
        }
    }
}


