package chapterNine.Vehicles;

public class Vehicle {

    private static String model= "FX201";
    private static String brand = "Manuel";

    public String toString() {
        return getModel() + " " + getBrand();
    }

    private String getBrand() {
        this.model = model;
        return model;
    }

    private String getModel() {
        this.brand = brand;
        return brand;
    }
}
