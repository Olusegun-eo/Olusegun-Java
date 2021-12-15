package playGround.OOP;

public class Student {
    private static String name;
    private static String address;
    private static int age;


    public Student(String name, int age, String address){
        Student.name =name;
        Student.address =address;
        Student.age = age;
    }

//    public static void setName(String name){
//        Student.name = name;
//    }

    public static String getName(){
        return name;
    }

//    public static void setAddress(String address){
//        Student.address = address;
//    }

    public static String getAddress(){
        return address;
    }

//    public static void setAge(int age){
//        Student.age = age;
//    }

    public static int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Student is " + Student.getName() + "And it is " + Student.age
                + "years old" + " The Address is " + Student.address;
    }

}

