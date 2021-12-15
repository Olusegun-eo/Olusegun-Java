package playGround.Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class EncapsulMainMethod {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println("What is your name? ");
        String stdName = scanner.nextLine();

//        students.add(stdName );
        Student student = new Student("Taye", "The kings close", 25);

        System.out.println(student.getName()+ " \t\t" + student.getAge() + "\t\t" + student.getAddress());
    }

}
