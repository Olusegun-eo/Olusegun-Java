package newMp3;

public class Volume {
    public int volume;

    public void mp3CanIncreaseVolume(int newVolume) {
        volume = 0;
        if (volume <= 0 && volume <= 100) {
            volume =+ 5;
        }
    }

    public void mp3CanDecreaseVolume(int volume){
        volume = 0;
        if (volume <= 0 && volume <= 100) {
            volume =- 5;
        }
    }

    public int getVolume() {
        return volume;
    }

}




//    public int increaseVolume(int increment) {
//        this.volume = this.volume += increment;
//        if (this.volume > 100) {
//            volume = 100;}
//        return this.volume;
//    }