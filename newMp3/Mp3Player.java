package newMp3;

public class Mp3Player {

    public static PlayList playlist;
    public static Volume volume;

    private boolean mp3CanBeOn;


    public void setMp3CanBeOn(boolean mp3CanBeOn) {
        this.mp3CanBeOn = mp3CanBeOn;
    }

    public boolean isMp3CanBeOn() {
        return mp3CanBeOn;
    }

}


//    private long id;
//    private String artist;
//    private long duration;
//    private String title;
//    private int numberOfSongs;





//    public boolean isPower() {
//        return power;
//    }
//
//    public void setPower(boolean power) {
//        this.power = power;
//    }
//
//    public boolean isCanBeOn() {
//        return canBeOn;
//    }
//
//    public void setCanBeOn(boolean canBeOn) {
//        this.canBeOn = canBeOn;
//    }
