package playGround.OOP;

public class StudentMainClass {

    public static void main(String[] args) {
        Student john = new Student("Okikiola", 25,
                "Emm's close Banana  Lagos  island");
        System.out.println(john.toString()); //OR
        System.out.println(Student.getName() + "\t\t" +
                Student.getAge() +"\t\t" + Student.getAddress());
    }

}

