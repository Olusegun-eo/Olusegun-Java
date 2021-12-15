//package schoolSystemChief.Database;
//
//import schoolSystemChief.models.Student;
//
//import java.util.Map;
//import java.util.TreeMap;
//
//public class PhoenixSchoolDB {
//    private static Map<String, Student> students = new TreeMap<>();
//    private static int totalNumberOfStudent = 0;
//    public static Map<String, Student> getStudent(){
//        return students;
//    }
//
//    private static void setStudents(Map<String, Student> students){
//        PhoenixSchoolDB.students = students;
//    }
//
//    public static Student addStudent(Student newStudent){
//        newStudent.setId(generateStudentId());
//        students.put(newStudent.getId(), newStudent);
//        return newStudent;
//    }
//
//    private static String generateStudentId(){
//        StringBuilder id = new StringBuilder("PHX");
//        totalNumberOfStudent++;
//        id.append(totalNumberOfStudent);
//        id.toString();
//        return id.toString();
//    }
//}
