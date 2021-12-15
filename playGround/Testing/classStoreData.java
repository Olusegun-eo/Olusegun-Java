package playGround.Testing;

import java.util.ArrayList;

public class classStoreData {
    public Student student;

    ArrayList<Student> getStudentList() {

//    ArrayList<Student> studentData();

        Student student1 = new Student("Kim", 233, 34);
        Student student2 = new Student("taye", 252, 34);
        Student student3 = new Student("Whateva", 33, 484);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        return studentList;
    }
}