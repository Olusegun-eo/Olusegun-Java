package playGround.Inheritance;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int heightValue, int startSpeed, int startGear){
        super(startGear, startSpeed);
        seatHeight = heightValue;
    }

    public void setSeatHeight(int seatValue){
        seatHeight = seatValue;
    }

}
