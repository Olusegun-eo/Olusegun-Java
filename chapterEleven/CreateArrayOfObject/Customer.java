package chapterEleven.CreateArrayOfObject;

public class Customer {
    String name;
    int id;

    public Customer(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public void display() {
        System.out.println("The Customer id is: " + id + ", and Customer name is: " + name);

    }



    public void display1() {
        System.out.println(id + ", " + name);
    }
}
