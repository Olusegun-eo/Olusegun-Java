package chapterSeventeen;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateJavaFileUsingFileInputStream {
    public static void main(String[] args) {

        try {
            System.out.println("Welcome to Creating Java File Using \"FileInputStream Class\"");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file or directory from a specific location");
            String name = scanner.nextLine();
            FileOutputStream fileOutputStream = new FileOutputStream(name, true);

            System.out.println("Enter the file content: \n ");
            String str = scanner.nextLine() + "\n";

//            Convert The Content(String) to byte
            byte[] bytes = str.getBytes();

//            Write Byte into File
            fileOutputStream.write(bytes);

//            Close the file Here
            fileOutputStream.close();

            System.out.println("The file is successfully saved ");
        }
        catch (IOException e) {
            System.out.println("Something went wrong");
            e.printStackTrace();;
        }
    }
}



/*
c. Creating Java file using Java NIO Files.createFile() method

This method is considered as the best method to create a file in Java and you should prefer the same if you are not using it. It is because there are no complexities or worries to close the file resources. This class is located in the java.nio.file package.

The Files.write() takes the following arguments:



Files.write(Paths.get( String filename));

Code to create file in Java using Java NIO File class:
package com.techvidvan.filecreation;
import java.io.IOException;
import java.nio.file. * ;
public class FileCreation2 {
  public static void main(String[] args) {
    Path path = Paths.get("D:\\MyFile.txt"); //creates Path instance
    try {
      Path p = Files.createFile(path); //creates file at specified location
      System.out.println("File Created at Path: " + p);
    }
    catch(IOException e) {
      System.out.println("Exception Occurred:");
      e.printStackTrace();
    }
  }
}




2. Opening a file in Java

We have learned to create a file in Java using various methods, now we will learn how to open and read a file in Java using Java programs. As soon as we run the program, we will get the file opened in our system.

There are many methods that we can use to read a file in Java.

Different ways to open a file in Java are:

    Desktop class in java
    Java FileInputStream class
    Java BufferedReader class
    FileReader class in Java
    Java Scanner class
    Java nio package

Let’s start discussing them with examples:
a. Using Java Desktop class

We can use the Desktop class of Java to open a file in Java. This class is present in the java.awt package. It has the method open() that opens a file for us. As the Desktop is platform-independent, so we need to check whether our Operating System supports Desktop or not.

If any error occurs, there arises an exception called FileNotFounDException.

The open() method of this class launches the specific application that opens the file.

The syntax of this method is:

public void open(File file) throws IOException

This method can give the following exceptions:’

    NullPointer Exception, if the file is null
    IllegalArgumentException if the given file does not exist.
    IOException if there is no application associated with the given file type.
    UnsupportedOperationExecution if the current platform does not support the Desktop

Code to open a file in Java using Desktop class:
import java.awt.Desktop;
import java.io. * ;
public class FileOpen1 {
  public static void main(String[] args) {
    try {
      //constructor of file class having file as argument
      File file = new File("D:\\TechVidvan.txt");
      if (!Desktop.isDesktopSupported())
      //check if Desktop is supported by Platform or not
      {
        System.out.println("not supported");
        return;
      }
      Desktop desktop = Desktop.getDesktop();
      if (file.exists()) //checks file exists or not
      desktop.open(file); //opens the specified file
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}






b. Using Java FileInputStream class
We can also use the Java FileInputStream class to read a file in Java. There is a constructor of this class that opens the file.

The syntax of the constructor is:

public FileInputStream(File file) throws FileNotFoundException

Here file is an argument that we pass and the constructor throws FileNotFoundException if the file does not exist.

Code to open a file in Java using FileInputStream class:
import java.io. * ;
import java.util.Scanner;
public class FileOpen2 {
  public static void main(String args[]) {
    try {
      //constructor of File class having file as argument
      File file = new File("D:\\TechVidvan.txt");
      //creates a buffer reader input stream
      BufferedReader br = new BufferedReader(new FileReader(file));
      System.out.println("The file content is: ");
      int r = 0;
      while ((r = br.read()) != -1) {
        System.out.print((char) r);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}






c. Using Java BufferedReader class

The BufferedReader class can also use to read and open a file in Java. It reads the text using a character input stream. The BufferedReader class is present in the java.io package.

We use the constructor of the class whose syntax is as follows:

BufferedReader in = new BufferedReader(Reader in, int size);

Code to open a file using BufferedReader class in Java:
import java.io. * ;
import java.util.Scanner;
public class FileOpen2 {
  public static void main(String args[]) {
    try {
      //constructor of File class having file as argument
      File file = new File("D:\\TechVidvan.txt");
      //creates a buffer reader input stream
      BufferedReader br = new BufferedReader(new FileReader(file));
      System.out.println("The file content is: ");
      int r = 0;
      while ((r = br.read()) != -1) {
        System.out.print((char) r);
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}


 */