package tvAssignment;

public class TvSet {

    private String myTvName;
    private boolean power;
    private String color;
    private int currentChannel = 0;
    private int volume = 0;
    private int channel = 0;




    //Change of Station
    //display image
    //Change of Channel will lead to change of DisplayChannels


    public void tvName(String myTvName) {

    }

    public String getTvName() {
        return myTvName;
    }

    public boolean tvPower(boolean powerOff) {
        this.power = power;
        return power = false;
    }

    public boolean tvIsOn(boolean powerOn, int channel, int volume) {
        this.power = power;
        this.channel = 0;
        this.volume = 0;
        return power = true;
    }
//All DONE


    //Work in Progress
    public void myTvChannel(int currentChannel) {
        this.channel = channel;
    }

    public int getMyChannel() {
        return channel;
    }

    public void changeChannel(int newValue) {
        if (power == true) {
            channel = channel + 1;
        }
    }

    public int getChangeChannel() {
        return channel;
    }

    public void changeVolume(int newVolume) {
        if (power == true) {
            volume = volume + 1;
        }
    }

    public int getChangeVolume() {
        return volume;
    }


}