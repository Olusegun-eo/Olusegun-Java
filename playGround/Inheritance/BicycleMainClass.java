package playGround.Inheritance;

public class BicycleMainClass {

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20,10,1);
        System.out.println("The gear is     " + mountainBike.gear);
        System.out.println(mountainBike.seatHeight);
        System.out.println(mountainBike.speed);

        mountainBike.applyBreak(1);

        System.out.println(mountainBike.speed + " " );

    }

}
