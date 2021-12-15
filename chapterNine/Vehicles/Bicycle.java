package chapterNine.Vehicles;

public class Bicycle extends Vehicle {
    private static int count = 23;

    public Bicycle(String brand, String model, int count) {
        super();
    }

    @Override
    public String toString() {
        return " Bicycle: " + super.toString() + "n\t" + getGearClear();
    }

    private int getGearClear() {
        this.count = count;
        return count;
    }
}
