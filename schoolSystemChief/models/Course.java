package schoolSystemChief.models;

public class Course {

    private int id;
    private String courseName;
    private String department;



    public Course( String name){
//        super();
        this.courseName = name;
    }

    public  Course(String name, String department){
        this(name);
        this.department = department;
    }




}
