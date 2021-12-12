package chapterSeventeen;

import java.io.File;
import java.io.IOException;

public class CreateFileInJavaUsingFileClass {
    public static void main(String[] args) {
        try {

            File file = new File("newFile.txt");
            boolean myFile = file.createNewFile();

            if (myFile) {
                System.out.println("I have successfully created my first file with Java createNewFile() method: "
                + file.getName());
            }
            else{
                System.out.println("File already exists here");
            }

        }catch (IOException e) {
            System.out.println("Something went wrong, hence file could not be created");
            e.printStackTrace();
        }
    }
}
