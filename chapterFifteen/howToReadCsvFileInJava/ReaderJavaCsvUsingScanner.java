package chapterFifteen.howToReadCsvFileInJava;

import java.io.File;
import java.util.Scanner;

/*
The Scanner class of Java provides various methods by which we can read a CSV file.
It provides a constructor that produces values scanned from the specified CSV file.
This class also breaks the data in the form of tokens.

There is a delimiter pattern, which, by default, matches white space.
Then, using different types of next() methods, we can convert the resulting tokens.
 */
public class ReaderJavaCsvUsingScanner {
    public static void main(String[] args) {
        try{
            //parsing a CSV file into the constructor of Scanner class
            Scanner scanner = new Scanner(new File("C:\\Users\\USER\\Documents\\csvDemo.csv"));

            //setting comma as delimiter pattern
            scanner.useDelimiter(" ,");

            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println("File can not be read");
            e.printStackTrace();
        }

    }
}
