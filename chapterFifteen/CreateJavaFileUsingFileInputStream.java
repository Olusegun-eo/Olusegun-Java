package chapterFifteen;

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


















2. Opening a file in Java

Opening a file in Java

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

Output:

We have created a file named TechVidvan.java in D drive, now we will run this code and we can see that the file opens after the execution of the code:

Opening file in java
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

Output:
After running the program, we will get the following output:

open file in java
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

Output:

How to open file in java
d. Using Java FileReader class

The FileReader class is another technique to read and open a file in Java. This class is present in the java.io package. It reads bytes from FileInputStream class.

Code to open a file using BufferedReader class in Java:
import java.io. * ;
public class FileOpen4 {
  public static void main(String args[]) {
    try {
      //constructor of the File class having file as an argument
      FileReader fr = new FileReader("D:\\Courses.txt");
      System.out.println("The file content is: ");
      int r = 0;
      while ((r = fr.read()) != -1) {
        System.out.print((char) r); //prints the content of the file
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

Output:

File opening in java
e. Using Scanner class

The Scanner class of java.util package is also useful in reading and opening a file in Java. Java scanner class can parse the text using regular expressions. It breaks the input on the delimiter’s pattern.

By default the delimiter is whitespace, but we can also add our own delimiter. We use the constructor of the Scanner class for opening and reading a file.

The signature of the constructor is:

public Scanner (File source) throws FileNotFoundException

Code to open a file using Scanner class:
import java.io.File;
import java.util.Scanner;
public class FileOpen5 {
  public static void main(String[] args) {
    try {
      File file = new File("D:\\TechVidvan.txt");
      Scanner sc = new Scanner(file); //file to be scanned
      System.out.println("The file content is:");
      while (sc.hasNextLine())
      //returns true if and only if scanner has another token
      System.out.println(sc.nextLine());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

Output:

open file in java
f. Using Java NIO package

The Java nio package has many classes and methods that use to read and open a file in Java. The two important methods are:

    readAllLines() method
    Collections.emptyList()

i. readAllLines() method

The readAllLines() method is the method that belongs to the File class.
This method is widely used to read all the lines from a file and decode the bytes from the file into characters using UTF-8 charset. This method returns the lines from the file in the form of a list.

The syntax of the readAllLines() method is:

public static List<String> readAllLines(Path path) throws IOException

The above method is equivalent to:

File.readAllLines(path, Standard CharSets.UTF_8)
ii. Collections.emptyList() method

The emptyList() method belongs to the Collections class and this class is present in the java.util package. This method gives an empty list

The syntax of the emptyList() method is:

public static final <T> List <T> emptyList()

Code to open a file using nio package:
import java.util. * ;
import java.nio.charset.StandardCharsets;
import java.nio.file. * ;
import java.io. * ;
public class FileOpen6 {
  public static List < String > readFileInList(String fileName) {
    List < String > lines = Collections.emptyList();
    try {
      lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
    }
    catch(IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
  public static void main(String[] args) {
    System.out.println("File content:");
    List l = readFileInList("D:\\TechVidvan.txt");
    Iterator < String > itr = l.iterator(); //access the elements
    while (itr.hasNext()) //returns true if and only if scanner has another token
    System.out.println(itr.next()); //prints the content of the file
  }
}

Output:

Read file in java
3. Deleting a file in Java

Deleting a file in Java

After creating and opening a file in Java, we move towards learning how to delete a file in Java using programming.

But you should remember that deleting the file from the system using the Java program will permanently delete the file without moving it to the trash or recycle bin. There are mainly two ways to delete a file in Java.

Different ways to delete a file in Java are:

a. Using File.delete() method
b. Using File.deleteOnExit() method
a. Using File.delete() method

The File.delete() method is the method of the File class of Java. This method deletes the file from the system. Its return type is boolean. It will return true if the file is deleted and false if the delete operation fails.

The syntax of File.delete() method is:

public boolean delete()

Code to delete a file using File.delete() method:
import java.io.File;
public class FileDelete1 {
  public static void main(String[] args) {
    try {
      File f = new File("D:\\myFile.txt"); //file to be delete
      if (f.delete()) //returns Boolean value
      {
        System.out.println("File " + f.getName() + " is deleted");
        //getting and printing the file name
      }
      else {
        System.out.println("Delete operation failed");
      }
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

Output:



If we go to the directory, we can see that the file has been deleted permanently.

deleting file in java

Now if we try to delete the file myFile.txt again then we will get the following output:

delete file in java
b. Using File.deleteOnExit() method

The File.deleteOnExit() method also deletes the file or directory defined by an abstract pathname. The deleteOnExit() method deletes files in reverse order. It deletes the file when JVM terminates.

It does not return any value. Once the request has made, it is not possible to cancel the request. So this method should be carefully used.

The method signature is:

public void deleteOnExit()

Usually, we use this method when we want to delete the temporary file. A temporary file is used to store the less important and temporary data, which should always be deleted when JVM terminates.
If we want to delete the .temp file manually, we can use File.delete() method.

Code to delete a file using File.deleteOnExit() method:
import java.io.File;
import java.io.IOException;
public class FileDelete2 {
  public static void main(String[] args) {
    try {
      File file = new File("D:\\myNewfile.txt"); //creates a file instance
      file.deleteOnExit(); //deletes the file when JVM terminates
      System.out.println("File Deleted");
      Thread.sleep(1000);
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}

Output:
After compiling, we can see the following output, and when we see in the folder, our file has deleted successfully:

deleting file in java
Conclusion

Finally, we reach the end of the article. Here we learned various important operations on a file. We have seen java create, open(or read), and delete a file using programming. There are many classes and methods used to accomplish these operations on a file.

We have explained each way with code and outputs for your better understanding. The File class plays a very important role in performing these operations. It contains many methods to do the same.

We hope, now you have become an expert in creating, opening and deleting the files in Java.

Did you like this article? If Yes, please give TechVidvan 5 Stars on Google | Facebook

Tags: create file in javacreating a file in javadelete file in javaJava - Create fileJava delete fileJava Open fileopen file in java
Leave a Reply


 */