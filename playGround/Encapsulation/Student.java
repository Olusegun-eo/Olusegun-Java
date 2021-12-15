package playGround.Encapsulation;

public class Student {
    //This is Encapsulation
    private String name;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    private int age;

    public Student(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }
}
