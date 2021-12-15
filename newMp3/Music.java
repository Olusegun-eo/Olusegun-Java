package newMp3;

public class Music {
    public String musicName;
    public int trackNumber;
    public int length;


    public Music(String  musicName, int trackNumber, int length){
        this.musicName = musicName;
        this.trackNumber = trackNumber;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Music{" +
                "musicName='" + musicName + '\'' +
                ", trackNumber=" + trackNumber +
                ", length=" + length +
                '}';
    }

}
