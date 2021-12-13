package chapterNine.Vehicles;

public class PolymorphismExample {

    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle("Trek", "7.4F", 47);
        System.out.println(vehicle);

        Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1);

         
    }
}
