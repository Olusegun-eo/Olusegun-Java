package playGround.Inheritance;
 public class Bicycle {
    protected int speed;
    protected int gear;

    public Bicycle(int startGear, int startSpeed){
        gear = startGear;
        speed = startSpeed;
    }

     public void setGear(int newValue){
        gear = newValue;
    }

    public void applyBreak(int decrement){
        speed -= decrement;
    }

    public void speedUp(int increment){
         speed += increment;
    }
}

