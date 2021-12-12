package chapterFifteen;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

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
                System.out.printf("File already \"%t%s\"  exists here", file.getName() );
            }

        }catch (IOException e) {
            System.out.println("Something went wrong, hence file could not be created");
            e.printStackTrace();
        }
    }



    public static void readFileFromFileOutputStream(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of the file");
            String name = scanner.nextLine();

            FileOutputStream fos = new FileOutputStream(name, true);

            String content = scanner.nextLine();
            byte[] bytesContent = content.getBytes();


            fos.close();
        }
        catch (IOException e) {
            System.out.println("Something went wrong, check the filename");
            e.printStackTrace();
        }

    }
}


